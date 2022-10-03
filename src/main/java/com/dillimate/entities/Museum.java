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
@Table(name = "museum")
public class Museum {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "museum_id")
	private Long museumId;
	
	@Column(name = "museum_name")
	@NotBlank(message = "Museum name should not be blank")
	private String museumName;
	
	@Column(name = "about")
	@NotBlank(message = "About should not be blank")
	private String about;
	
	@Column(name = "address")
	@NotBlank(message = "Address should not be blank")
	private String address;
	
	@Column(name = "opening_time")
	@NotBlank(message = "Opening time should not be blank")
	private String openingTime;
	
	@Column(name = "closing_time")
	@NotBlank(message = "Closing time should not be blank")
	private String closingTime;
	
	@Column(name = "ticket_charges")
	@NotBlank(message = "Ticket charges should not be blank")
	private double ticketCharges;

	@Lob
	@Column(name = "museum_pic1", length = Integer.MAX_VALUE, nullable = true)
	private byte[] museumPic1;
	
	@Lob
	@Column(name = "museum_pic2", length = Integer.MAX_VALUE, nullable = true)
	private byte[] museumPic2;
	
	@Lob
	@Column(name = "museum_pic3", length = Integer.MAX_VALUE, nullable = true)
	private byte[] museumPic3;
	
	@Lob
	@Column(name = "museum_pic4", length = Integer.MAX_VALUE, nullable = true)
	private byte[] museumPic4;
	
	@Lob
	@Column(name = "museum_pic5", length = Integer.MAX_VALUE, nullable = true)
	private byte[] museumPic5;
	
	@Lob
	@Column(name = "museum_pic6", length = Integer.MAX_VALUE, nullable = true)
	private byte[] museumPic6;
	
	public Museum() {
		
	}
	
	public Long getMuseumId() {
		return museumId;
	}
	
	public void setMuseumId(Long museumId) {
		this.museumId = museumId;
	}
	
	public String getMuseumName() {
		return museumName;
	}
	
	public void setMuseumName(String museumName) {
		this.museumName = museumName;
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
	
	public double getTicketCharges() {
		return ticketCharges;
	}
	
	public void setTicketCharges(double ticketCharges) {
		this.ticketCharges = ticketCharges;
	}

	public byte[] getMuseumPic1() {
		return museumPic1;
	}

	public void setMuseumPic1(byte[] museumPic1) {
		this.museumPic1 = museumPic1;
	}

	public byte[] getMuseumPic2() {
		return museumPic2;
	}

	public void setMuseumPic2(byte[] museumPic2) {
		this.museumPic2 = museumPic2;
	}

	public byte[] getMuseumPic3() {
		return museumPic3;
	}

	public void setMuseumPic3(byte[] museumPic3) {
		this.museumPic3 = museumPic3;
	}

	public byte[] getMuseumPic4() {
		return museumPic4;
	}

	public void setMuseumPic4(byte[] museumPic4) {
		this.museumPic4 = museumPic4;
	}

	public byte[] getMuseumPic5() {
		return museumPic5;
	}

	public void setMuseumPic5(byte[] museumPic5) {
		this.museumPic5 = museumPic5;
	}

	public byte[] getMuseumPic6() {
		return museumPic6;
	}

	public void setMuseumPic6(byte[] museumPic6) {
		this.museumPic6 = museumPic6;
	}
	
}
