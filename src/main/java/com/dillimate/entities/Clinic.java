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
@Table(name = "clinic")
public class Clinic {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "clinic_id")
	private Long clinicId;

	@Column(name = "clinic_name")
	@NotBlank(message = "Clinic name should not be blank")
	private String clinicName;
	
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
	
	@Column(name = "clinic_fees")
	@NotBlank(message = "Clinic fees should not be blank")
	private double clinicFees;
	
	@Lob
	@Column(name = "clinic_pic1", length = Integer.MAX_VALUE, nullable = true)
	private byte[] clinicPic1;
	
	@Lob
	@Column(name = "clinic_pic2", length = Integer.MAX_VALUE, nullable = true)
	private byte[] clinicPic2;
	
	@Lob
	@Column(name = "clinic_pic3", length = Integer.MAX_VALUE, nullable = true)
	private byte[] clinicPic3;
	
	@Lob
	@Column(name = "clinic_pic4", length = Integer.MAX_VALUE, nullable = true)
	private byte[] clinicPic4;
	
	@Lob
	@Column(name = "clinic_pic5", length = Integer.MAX_VALUE, nullable = true)
	private byte[] clinicPic5;
	
	@Lob
	@Column(name = "clinic_pic6", length = Integer.MAX_VALUE, nullable = true)
	private byte[] clinicPic6;

	public Clinic() {
		
	}
	
	public Long getClinicId() {
		return clinicId;
	}

	public void setClinicId(Long clinicId) {
		this.clinicId = clinicId;
	}

	public String getClinicName() {
		return clinicName;
	}

	public void setClinicName(String clinicName) {
		this.clinicName = clinicName;
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

	public double getClinicFees() {
		return clinicFees;
	}

	public void setClinicFees(double clinicFees) {
		this.clinicFees = clinicFees;
	}

	public byte[] getClinicPic1() {
		return clinicPic1;
	}

	public void setClinicPic1(byte[] clinicPic1) {
		this.clinicPic1 = clinicPic1;
	}

	public byte[] getClinicPic2() {
		return clinicPic2;
	}

	public void setClinicPic2(byte[] clinicPic2) {
		this.clinicPic2 = clinicPic2;
	}

	public byte[] getClinicPic3() {
		return clinicPic3;
	}

	public void setClinicPic3(byte[] clinicPic3) {
		this.clinicPic3 = clinicPic3;
	}

	public byte[] getClinicPic4() {
		return clinicPic4;
	}

	public void setClinicPic4(byte[] clinicPic4) {
		this.clinicPic4 = clinicPic4;
	}

	public byte[] getClinicPic5() {
		return clinicPic5;
	}

	public void setClinicPic5(byte[] clinicPic5) {
		this.clinicPic5 = clinicPic5;
	}

	public byte[] getClinicPic6() {
		return clinicPic6;
	}

	public void setClinicPic6(byte[] clinicPic6) {
		this.clinicPic6 = clinicPic6;
	}
}