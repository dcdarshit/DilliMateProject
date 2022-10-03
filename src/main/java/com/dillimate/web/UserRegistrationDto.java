package com.dillimate.web;

import java.util.Date;

import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

public class UserRegistrationDto {
	
	@NotNull(message = "First name is required")
    private String firstName;
    
	@NotNull(message = "Last name is required")
    private String lastName;

	@NotNull(message = "Password is required")
    private String password;

	@NotNull(message = "Confirm password is required")
    private String confirmPassword;

    @Email
    @NotNull(message = "EMail is required")
    private String email;
    
	@Lob
	@NotNull(message = "Profile pic is required")
	private byte[] profilePic;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date createDate;
	
	public UserRegistrationDto() {
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

    public byte[] getProfilePic() {
		return profilePic;
	}

	public void setProfilePic(byte[] profilePic) {
		this.profilePic = profilePic;
	}
	
	public Date getCreateDate() {
		return createDate;
    }

    public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
}
