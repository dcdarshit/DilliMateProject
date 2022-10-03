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
@Table(name = "driver")
public class Driver {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "driver_id")
	private Long driverId;
	
	@Column(name = "driver_name")
	@NotBlank(message = "Driver name should not be blank")
	private String driverName;
	
	@Column(name = "phone_no")
	@NotBlank(message = "Phone number should not be blank")
	private String phoneNo;
	
	@Column(name = "cab_no")
	@NotBlank(message = "Cab number should not be blank")
	private String cabNo;
	
	@Column(name = "rating")
	@NotBlank(message = "Rating should not be blank")
	private double rating;
	
	@Column(name = "zone")
	@NotBlank(message = "Zone should not be blank")
	private String zone;
	
	@Lob
	@Column(name = "driver_pic", length = Integer.MAX_VALUE, nullable = true)
	private byte[] driverPic;

	public Driver() {
		
	}
	
	public Long getDriverId() {
		return driverId;
	}
	
	public void setDriverId(Long driverId) {
		this.driverId = driverId;
	}
	
	public String getDriverName() {
		return driverName;
	}
	
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	
	public String getPhoneNo() {
		return phoneNo;
	}
	
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	public String getCabNo() {
		return cabNo;
	}
	
	public void setCabNo(String cabNo) {
		this.cabNo = cabNo;
	}
	
	public double getRating() {
		return rating;
	}
	
	public void setRating(double rating) {
		this.rating = rating;
	}
	
	public String getZone() {
		return zone;
	}
	
	public void setZone(String zone) {
		this.zone = zone;
	}
	
	public byte[] getDriverPic() {
		return driverPic;
	}

	public void setDriverPic(byte[] driverPic) {
		this.driverPic = driverPic;
	}
	
}
