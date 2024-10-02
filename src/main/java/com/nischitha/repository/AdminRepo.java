package com.nischitha.repository;

	import org.springframework.data.jpa.repository.JpaRepository;

	import com.nischitha.model.Admin;

public interface AdminRepo extends JpaRepository<Admin, Integer> {
		
		public Admin findByAdminUserNameAndAdminPassword(String username,String password);
		
		public Admin findByAdminUserName(String username);
		
		public Admin findByAdminPassword(String password);
		
		

	}

