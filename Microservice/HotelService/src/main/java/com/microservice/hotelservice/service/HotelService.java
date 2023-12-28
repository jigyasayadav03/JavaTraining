package com.microservice.hotelservice.service;

import java.util.List;

import com.microservice.hotelservice.entity.Hotel;

public interface HotelService {
public Hotel addHotel(Hotel hotel);

public List<Hotel> getAllHotel();
public Hotel getbyId(String id);
}
