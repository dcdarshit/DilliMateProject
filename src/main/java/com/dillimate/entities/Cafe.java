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
@Table(name = "cafe")
public class Cafe {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cafe_id")
	private Long cafeId;
	
	@Column(name = "cafe_name")
	@NotBlank(message = "Cafe name should not be blank")
	private String cafeName;

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
	@Column(name = "cafe_pic1", length = Integer.MAX_VALUE, nullable = true)
	private byte[] cafePic1;
	
	@Lob
	@Column(name = "cafe_pic2", length = Integer.MAX_VALUE, nullable = true)
	private byte[] cafePic2;
	
	@Lob
	@Column(name = "cafe_pic3", length = Integer.MAX_VALUE, nullable = true)
	private byte[] cafePic3;
	
	@Lob
	@Column(name = "cafe_pic4", length = Integer.MAX_VALUE, nullable = true)
	private byte[] cafePic4;
	
	@Lob
	@Column(name = "cafe_pic5", length = Integer.MAX_VALUE, nullable = true)
	private byte[] cafePic5;
	
	@Lob
	@Column(name = "cafe_pic6", length = Integer.MAX_VALUE, nullable = true)
	private byte[] cafePic6;

	public Cafe() {
		
	}
	
	public Long getCafeId() {
		return cafeId;
	}
	
	public void setCafeId(Long cafeId) {
		this.cafeId = cafeId;
	}
	
	public String getCafeName() {
		return cafeName;
	}
	
	public void setCafeName(String cafeName) {
		this.cafeName = cafeName;
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
	
	public byte[] getCafePic1() {
		return cafePic1;
	}

	public void setCafePic1(byte[] cafePic1) {
		this.cafePic1 = cafePic1;
	}

	public byte[] getCafePic2() {
		return cafePic2;
	}

	public void setCafePic2(byte[] cafePic2) {
		this.cafePic2 = cafePic2;
	}

	public byte[] getCafePic3() {
		return cafePic3;
	}

	public void setCafePic3(byte[] cafePic3) {
		this.cafePic3 = cafePic3;
	}

	public byte[] getCafePic4() {
		return cafePic4;
	}

	public void setCafePic4(byte[] cafePic4) {
		this.cafePic4 = cafePic4;
	}

	public byte[] getCafePic5() {
		return cafePic5;
	}

	public void setCafePic5(byte[] cafePic5) {
		this.cafePic5 = cafePic5;
	}

	public byte[] getCafePic6() {
		return cafePic6;
	}

	public void setCafePic6(byte[] cafePic6) {
		this.cafePic6 = cafePic6;
	}
	
}
