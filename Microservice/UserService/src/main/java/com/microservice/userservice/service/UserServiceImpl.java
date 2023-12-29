package com.microservice.userservice.service;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.microservice.userservice.entity.Hotel;
import com.microservice.userservice.entity.Rating;
import com.microservice.userservice.entity.User;
import com.microservice.userservice.exception.ResourceNotFoundException;
import com.microservice.userservice.externalService.HotelService;
import com.microservice.userservice.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
@Autowired
private UserRepository userRepository;
@Autowired
private RestTemplate restTemplate;
@Autowired 
private HotelService hotelService;
private Logger logger= LoggerFactory.getLogger(UserService.class);

	@Override
	public List<User> getUser() {
		// TODO Auto-generated method stub
		List<User> list= userRepository.findAll();
		return list;
	}


	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub\
		//generate a unique userid 
		String randomUserID= UUID.randomUUID().toString();
		user.setId(randomUserID);
		User u= userRepository.save(user);
		return u;
	}

	@Override
	public User getUserByid(String id) {
		User  u=userRepository.findById(id).orElseThrow(()->new ResourceNotFoundException ("User with given id not foundl;"));
	//calling rating service from user service
		//http://localhost:8083/ratings/users/6bd41518-4d5c-48de-80b7-122d4854cbd5
		
		//Rating[] ratingsofuser= restTemplate.getForObject("http://localhost:8083/ratings/users/"+u.getId(),Rating[].class);
		Rating[] ratingsofuser= restTemplate.getForObject("http://RATING-SERVICE/ratings/users/"+u.getId(),Rating[].class);
		logger.info("",ratingsofuser);
		List<Rating>ratings=Arrays.stream(ratingsofuser).toList();
		
	List<Rating>ratinglist=	ratings.stream().map(rating->{
			//api to get the hotel service set the hotel to rating 
		//http://localhost:8081/hotels/6bd41518-4d5c-48de-80b7-122d4854cbd5
		ResponseEntity<Hotel>forentity= restTemplate.getForEntity("http://HOTEL-SERVICE/hotels/"+rating.getHotelId(), Hotel.class);
		//Hotel hotel= forentity.getBody();
		Hotel hotel=hotelService.getHotel(rating.getHotelId());
		logger.info("response",forentity.getStatusCode());
		rating.setHotel(hotel);
			return rating;
			
		}).collect(Collectors.toList());
		
		
		
		
		
		u.setRating(ratinglist);
		return u;
	}
	

}
