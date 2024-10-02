package com.nischitha.controller;


	import jakarta.validation.Valid;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.http.HttpStatus;
	import org.springframework.http.ResponseEntity;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RestController;

	import com.nischitha.exceptions.AdminException;
	import com.nischitha.model.Admin;
	import com.nischitha.service.AdminServiceImpl;


	@RestController
	public class AdminController {
		
		@Autowired
		private AdminServiceImpl asi;
		
		
		
		@PostMapping("/admin")
		public ResponseEntity<Admin> registerAdmin(@Valid @RequestBody Admin admin) throws AdminException
		{
			 Admin adm = asi.addAdmin(admin);
			 
			 return new ResponseEntity<Admin>(adm,HttpStatus.OK);
			
		}
		
		
		
		
		
		
		

	}
