package com.nischitha.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

@Entity
public class Admin {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer adminId;
	
	@NotNull(message = "This Field can not be null..")
	@NotBlank(message = "This Field can not be blank..")
	@NotEmpty(message = "This Field can not be empty..")
	private String adminUserName;
	
	@NotNull(message = "This Field can not be null..")
	@NotBlank(message = "This Field can not be blank..")
	@NotEmpty(message = "This Field can not be empty..")
	private String adminPassword;
	
	
	

	
	public Integer getAdminId() {
		return adminId;
	}





	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}





	public String getAdminUserName() {
		return adminUserName;
	}





	public void setAdminUserName(String adminUserName) {
		this.adminUserName = adminUserName;
	}





	public String getAdminPassword() {
		return adminPassword;
	}





	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}





	public Admin() {
		// TODO Auto-generated constructor stub
	}





	public Admin(Integer adminId,
			@NotNull(message = "This Field can not be null..") @NotBlank(message = "This Field can not be blank..") @NotEmpty(message = "This Field can not be empty..") String adminUserName,
			@NotNull(message = "This Field can not be null..") @NotBlank(message = "This Field can not be blank..") @NotEmpty(message = "This Field can not be empty..") String adminPassword) {
		super();
		this.adminId = adminId;
		this.adminUserName = adminUserName;
		this.adminPassword = adminPassword;
	}
	
	

}
