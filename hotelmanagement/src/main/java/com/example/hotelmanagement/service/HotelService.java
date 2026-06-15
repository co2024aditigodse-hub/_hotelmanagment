package com.example.hotelmanagement.service;

import com.example.hotelmanagement.entity.Hotel;
import com.example.hotelmanagement.repository.HotelRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelService {

    private final HotelRepository hotelRepository;

    public HotelService(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    // Save Hotel
    public Hotel saveHotel(Hotel hotel) {
        return hotelRepository.save(hotel);
    }

    // Get All Hotels
    public List<Hotel> getAllHotels() {
        return hotelRepository.findAll();
    }

    // Get Hotel By ID
    public Hotel getHotelById(Long id) {
        return hotelRepository.findById(id).orElse(null);
    }
}