package com.dillimate.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "restaurant")
public class Restaurant {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "restaurant_id")
	private Long restaurantId;
	
	@Column(name = "restaurant_name")
	@NotBlank(message = "Restaurant name should not be blank")
	private String restaurantName;

	@Column(name = "about")
	@NotBlank(message = "About should not be blank")
	private String about;
	
	@Column(name = "address")
	@NotBlank(message = "Address should not be blank")
	private String address;
	
	@Column(name = "popular_dish")
	private String popularDish;
	
	@Column(name = "average_cost")
	private double averageCost;
	
	@Column(name = "opening_time")
	@NotBlank(message = "Opening time should not be blank")
	private String openingTime;
	
	@Column(name = "closing_time")
	@NotBlank(message = "Closing time should not be blank")
	private String closingTime;
	
	@Lob
	@Column(name = "restaurant_pic1", length = Integer.MAX_VALUE, nullable = true)
	private byte[] restaurantPic1;
	
	@Lob
	@Column(name = "restaurant_pic2", length = Integer.MAX_VALUE, nullable = true)
	private byte[] restaurantPic2;
	
	@Lob
	@Column(name = "restaurant_pic3", length = Integer.MAX_VALUE, nullable = true)
	private byte[] restaurantPic3;
	
	@Lob
	@Column(name = "restaurant_pic4", length = Integer.MAX_VALUE, nullable = true)
	private byte[] restaurantPic4;
	
	@Lob
	@Column(name = "restaurant_pic5", length = Integer.MAX_VALUE, nullable = true)
	private byte[] restaurantPic5;
	
	@Lob
	@Column(name = "restaurant_pic6", length = Integer.MAX_VALUE, nullable = true)
	private byte[] restaurantPic6;

	public Restaurant() {
		
	}
	
	public Long getRestaurantId() {
		return restaurantId;
	}
	
	public void setRestaurantId(Long restaurantId) {
		this.restaurantId = restaurantId;
	}
	
	public String getRestaurantName() {
		return restaurantName;
	}
	
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	
	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPopularDish() {
		return popularDish;
	}
	
	public void setPopularDish(String popularDish) {
		this.popularDish = popularDish;
	}
	
	public double getAverageCost() {
		return averageCost;
	}
	
	public void setAverageCost(double averageCost) {
		this.averageCost = averageCost;
	}
	
	public String getOpeningTime() {
		return openingTime;
	}
	
	public void setOpeningTime(String openingTime) {
		this.openingTime = openingTime;
	}
	
	public String getClosingTime() {
		return closingTime;
	}
	
	public void setClosingTime(String closingTime) {
		this.closingTime = closingTime;
	}
	
	public byte[] getRestaurantPic1() {
		return restaurantPic1;
	}

	public void setRestaurantPic1(byte[] restaurantPic1) {
		this.restaurantPic1 = restaurantPic1;
	}

	public byte[] getRestaurantPic2() {
		return restaurantPic2;
	}

	public void setRestaurantPic2(byte[] restaurantPic2) {
		this.restaurantPic2 = restaurantPic2;
	}

	public byte[] getRestaurantPic3() {
		return restaurantPic3;
	}

	public void setRestaurantPic3(byte[] restaurantPic3) {
		this.restaurantPic3 = restaurantPic3;
	}

	public byte[] getRestaurantPic4() {
		return restaurantPic4;
	}

	public void setRestaurantPic4(byte[] restaurantPic4) {
		this.restaurantPic4 = restaurantPic4;
	}

	public byte[] getRestaurantPic5() {
		return restaurantPic5;
	}

	public void setRestaurantPic5(byte[] restaurantPic5) {
		this.restaurantPic5 = restaurantPic5;
	}

	public byte[] getRestaurantPic6() {
		return restaurantPic6;
	}

	public void setRestaurantPic6(byte[] restaurantPic6) {
		this.restaurantPic6 = restaurantPic6;
	}
}
