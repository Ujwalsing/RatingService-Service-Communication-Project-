package com.ratingservice.service;

import java.util.List;

import com.ratingservice.entity.Rating;

public interface RatingService {
	Rating createRating(Rating rating);
	List<Rating> getRating();
	List<Rating> getRatingByUserId(String userId);
	List<Rating> getRatingByHotelId(String hotelId);
	
}
