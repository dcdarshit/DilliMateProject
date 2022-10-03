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
@Table(name = "monument")
public class Monument {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "monument_id")
	private Long monumentId;
	
	@Column(name = "monument_name")
	@NotBlank(message = "Monument name should not be blank")
	private String monumentName;
	
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
	@NotBlank(message = "Ticket Charges should not be blank")
	private double ticketCharges;
	
	@Lob
	@Column(name = "monument_pic1", length = Integer.MAX_VALUE, nullable = true)
	private byte[] monumentPic1;
	
	@Lob
	@Column(name = "monument_pic2", length = Integer.MAX_VALUE, nullable = true)
	private byte[] monumentPic2;
	
	@Lob
	@Column(name = "monument_pic3", length = Integer.MAX_VALUE, nullable = true)
	private byte[] monumentPic3;
	
	@Lob
	@Column(name = "monument_pic4", length = Integer.MAX_VALUE, nullable = true)
	private byte[] monumentPic4;
	
	@Lob
	@Column(name = "monument_pic5", length = Integer.MAX_VALUE, nullable = true)
	private byte[] monumentPic5;
	
	@Lob
	@Column(name = "monument_pic6", length = Integer.MAX_VALUE, nullable = true)
	private byte[] monumentPic6;
	
	public Monument() {
		
	}
	
	public Long getMonumentId() {
		return monumentId;
	}
	
	public void setMonumentId(Long monumentId) {
		this.monumentId = monumentId;
	}
	
	public String getMonumentName() {
		return monumentName;
	}
	
	public void setMonumentName(String monumentName) {
		this.monumentName = monumentName;
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
	
	public byte[] getMonumentPic1() {
		return monumentPic1;
	}

	public void setMonumentPic1(byte[] monumentPic1) {
		this.monumentPic1 = monumentPic1;
	}

	public byte[] getMonumentPic2() {
		return monumentPic2;
	}

	public void setMonumentPic2(byte[] monumentPic2) {
		this.monumentPic2 = monumentPic2;
	}

	public byte[] getMonumentPic3() {
		return monumentPic3;
	}

	public void setMonumentPic3(byte[] monumentPic3) {
		this.monumentPic3 = monumentPic3;
	}

	public byte[] getMonumentPic4() {
		return monumentPic4;
	}

	public void setMonumentPic4(byte[] monumentPic4) {
		this.monumentPic4 = monumentPic4;
	}

	public byte[] getMonumentPic5() {
		return monumentPic5;
	}

	public void setMonumentPic5(byte[] monumentPic5) {
		this.monumentPic5 = monumentPic5;
	}

	public byte[] getMonumentPic6() {
		return monumentPic6;
	}

	public void setMonumentPic6(byte[] monumentPic6) {
		this.monumentPic6 = monumentPic6;
	}

}
