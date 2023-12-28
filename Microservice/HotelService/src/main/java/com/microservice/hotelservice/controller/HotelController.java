package com.microservice.hotelservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.hotelservice.entity.Hotel;
import com.microservice.hotelservice.service.HotelService;


@RestController
@RequestMapping("/hotels")
public class HotelController {

	@Autowired
	public HotelService hotelService;
@PostMapping
public ResponseEntity<Hotel> addhotel(@RequestBody Hotel hotel){
	Hotel h= hotelService.addHotel(hotel);
	return ResponseEntity.status(HttpStatus.CREATED).body(h);
	
	
}
@GetMapping("/{id}")
public ResponseEntity<Hotel> getByID(@PathVariable String id){
   Hotel h = hotelService.getbyId(id);
    return ResponseEntity.ok(h);
}


//for all users

@GetMapping
public ResponseEntity<List<Hotel>> getHotel(){
	List<Hotel> h= hotelService.getAllHotel();
	return ResponseEntity.ok(h);
}




}
