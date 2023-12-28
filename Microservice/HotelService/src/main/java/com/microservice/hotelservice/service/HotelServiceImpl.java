package com.microservice.hotelservice.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.hotelservice.entity.Hotel;
import com.microservice.hotelservice.repository.HotelRepository;
import com.microservice.hotelservice.service.exception.ResourceNotFoundException;
@Service
public class HotelServiceImpl implements HotelService{
@Autowired 
private HotelRepository hotelrepository;


	@Override
	public Hotel addHotel(Hotel hotel) {
		// TODO Auto-generated method stub
		String randomUserID= UUID.randomUUID().toString();
		hotel.setId(randomUserID);
		Hotel h=hotelrepository.save(hotel);
		return h;
	}

	@Override
	public List<Hotel> getAllHotel() {
		// TODO Auto-generated method stub
		List<Hotel>h= hotelrepository.findAll();
		return h;
	}

	@Override
	public Hotel getbyId(String id) {
		// TODO Auto-generated method stub
		Hotel h= hotelrepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("no such hotel found with the id specified"));
		return h;
	}

}
