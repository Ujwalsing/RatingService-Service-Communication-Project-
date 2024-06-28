package com.ratingservice.entity;

import org.hibernate.annotations.UuidGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "userRating")
@AllArgsConstructor
@NoArgsConstructor
public class Rating {
	@Id
	@GeneratedValue
	@UuidGenerator
	private String ratingId;
	private String userId;
	@UuidGenerator
	private String hotelId;
	private int rating;
	private String feedback;
	
}
