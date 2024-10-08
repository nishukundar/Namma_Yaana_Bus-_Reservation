package com.nischitha.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nischitha.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
	
	public User findByContact(Long contact);
	
	
	
	

}
