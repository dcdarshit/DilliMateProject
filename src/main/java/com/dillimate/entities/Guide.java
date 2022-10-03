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
@Table(name = "guide")
public class Guide {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "guide_id")
	private Long guideId;
	
	@Column(name = "guide_name")
	@NotBlank(message = "Guide name should not be blank")
	private String guideName;
	
	@Column(name = "phone_no")
	@NotBlank(message = "Phone number should not be blank")
	private String phoneNo;
	
	@Column(name = "rating")
	@NotBlank(message = "Rating should not be blank")
	private double rating;
	
	@Column(name = "charge_per_hour")
	@NotBlank(message = "Charge per hour should not be blank")
	private double chargePerHour;

	@Column(name = "language_preference")
	@NotBlank(message = "Language preference should not be blank")
	private String langPreference;
	
	@Lob
	@Column(name = "guide_pic", length = Integer.MAX_VALUE, nullable = true)
	private byte[] guidePic;
	
	public Guide() {
		
	}
	
	public Long getGuideId() {
		return guideId;
	}
	
	public void setGuideId(Long guideId) {
		this.guideId = guideId;
	}
	
	public String getGuideName() {
		return guideName;
	}
	
	public void setGuideName(String guideName) {
		this.guideName = guideName;
	}
	
	public String getPhoneNo() {
		return phoneNo;
	}
	
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	public double getRating() {
		return rating;
	}
	
	public void setRating(double rating) {
		this.rating = rating;
	}
	
	public double getChargePerHour() {
		return chargePerHour;
	}
	
	public void setChargePerHour(double chargePerHour) {
		this.chargePerHour = chargePerHour;
	}
	
	public String getLangPreference() {
		return langPreference;
	}
	
	public void setLangPreference(String langPreference) {
		this.langPreference = langPreference;
	}
	
	public byte[] getGuidePic() {
		return guidePic;
	}

	public void setGuidePic(byte[] guidePic) {
		this.guidePic = guidePic;
	}

}
