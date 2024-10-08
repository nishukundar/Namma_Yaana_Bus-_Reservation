package com.nischitha.model;


import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer userLoginId;
	
	
	@NotNull(message = "username can not be null..")
	@NotBlank(message = "username can not be blank..")
	@NotEmpty(message = "username can not be empty..")
	private String userName;
	
	@Size(min = 6,max = 12,message = "password should be between 6 to 12 characters")
	private String password;
	
	
	@NotNull(message = "firstName can not be null..")
	@NotBlank(message = "firstName can not be blank..")
	@NotEmpty(message = "firstName can not be empty..")
	private String firstName;
	
	private String lastName;


	private Long contact;
	
	@NotNull(message = "email can not be null..")
	@NotBlank(message = "email can not be blank..")
	@NotEmpty(message = "email can not be empty..")
	private String email;
	
//	@JsonIgnore
//	@OneToMany(cascade = CascadeType.ALL,mappedBy = "user")
//	private List<Reservation> rervation = new ArrayList<>();
	

	
	



	

	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(Integer userLoginId,
		@NotNull(message = "username can not be null..") @NotBlank(message = "username can not be blank..") @NotEmpty(message = "username can not be empty..") String userName,
		@Size(min = 6, max = 12, message = "password should be between 6 to 12 characters") String password,
		@NotNull(message = "firstName can not be null..") @NotBlank(message = "firstName can not be blank..") @NotEmpty(message = "firstName can not be empty..") String firstName,
		String lastName, Long contact,
		@NotNull(message = "email can not be null..") @NotBlank(message = "email can not be blank..") @NotEmpty(message = "email can not be empty..") String email) {
	super();
	this.userLoginId = userLoginId;
	this.userName = userName;
	this.password = password;
	this.firstName = firstName;
	this.lastName = lastName;
	this.contact = contact;
	this.email = email;
}

	public Integer getUserLoginId() {
		return userLoginId;
	}

	public void setUserLoginId(Integer userLoginId) {
		this.userLoginId = userLoginId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public Long getContact() {
		return contact;
	}

	public void setContact(Long contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	
}