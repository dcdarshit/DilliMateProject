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
@Table(name = "hotel")
public class Hotel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "hotel_id")
	private Long hotelId;
	
	@Column(name = "hotel_name")
	@NotBlank(message = "Hotel name should not be blank")
	private String hotelName;
	
	@Column(name = "about")
	@NotBlank(message = "About should not be blank")
	private String about;
	
	@Column(name = "services")
	@NotBlank(message = "Services should not be blank")
	private String services;
	
	@Column(name = "room")
	@NotBlank(message = "Room should not be blank")
	private String room;
	
	@Column(name = "address")
	@NotBlank(message = "Address should not be blank")
	private String address;
	
	@Column(name = "phone_no")
	@NotBlank(message = "Phone No. should not be blank")
	private String phoneNo;
	
	@Column(name = "price")
	@NotBlank(message = "Price should not be blank")
	private double price;
	
	@Column(name = "rating")
	@NotBlank(message = "Rating should not be blank")
	private double rating;

	@Lob
	@Column(name = "hotel_pic1", length = Integer.MAX_VALUE, nullable = true)
	private byte[] hotelPic1;
	
	@Lob
	@Column(name = "hotel_pic2", length = Integer.MAX_VALUE, nullable = true)
	private byte[] hotelPic2;
	
	@Lob
	@Column(name = "hotel_pic3", length = Integer.MAX_VALUE, nullable = true)
	private byte[] hotelPic3;
	
	@Lob
	@Column(name = "hotel_pic4", length = Integer.MAX_VALUE, nullable = true)
	private byte[] hotelPic4;
	
	@Lob
	@Column(name = "hotel_pic5", length = Integer.MAX_VALUE, nullable = true)
	private byte[] hotelPic5;
	
	@Lob
	@Column(name = "hotel_pic6", length = Integer.MAX_VALUE, nullable = true)
	private byte[] hotelPic6;
	public Hotel() {
		
	}
	
	public Long getHotelId() {
		return hotelId;
	}
	
	public void setHotelId(Long hotelId) {
		this.hotelId = hotelId;
	}
	
	public String getHotelName() {
		return hotelName;
	}
	
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	
	public String getAbout() {
		return about;
	}
	
	public void setAbout(String about) {
		this.about = about;
	}
	
	public String getServices() {
		return services;
	}
	
	public void setServices(String services) {
		this.services = services;
	}
	
	public String getRoom() {
		return room;
	}
	
	public void setRoom(String room) {
		this.room = room;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getPhoneNo() {
		return phoneNo;
	}
	
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getRating() {
		return rating;
	}
	
	public void setRating(double rating) {
		this.rating = rating;
	}

	public byte[] getHotelPic1() {
		return hotelPic1;
	}

	public void setHotelPic1(byte[] hotelPic1) {
		this.hotelPic1 = hotelPic1;
	}

	public byte[] getHotelPic2() {
		return hotelPic2;
	}

	public void setHotelPic2(byte[] hotelPic2) {
		this.hotelPic2 = hotelPic2;
	}

	public byte[] getHotelPic3() {
		return hotelPic3;
	}

	public void setHotelPic3(byte[] hotelPic3) {
		this.hotelPic3 = hotelPic3;
	}

	public byte[] getHotelPic4() {
		return hotelPic4;
	}

	public void setHotelPic4(byte[] hotelPic4) {
		this.hotelPic4 = hotelPic4;
	}

	public byte[] getHotelPic5() {
		return hotelPic5;
	}

	public void setHotelPic5(byte[] hotelPic5) {
		this.hotelPic5 = hotelPic5;
	}

	public byte[] getHotelPic6() {
		return hotelPic6;
	}

	public void setHotelPic6(byte[] hotelPic6) {
		this.hotelPic6 = hotelPic6;
	}
	
}
