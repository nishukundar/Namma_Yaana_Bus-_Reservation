package com.nischitha.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.nischitha.model.CurrentUserSession;

public interface SessionRepo extends JpaRepository<CurrentUserSession, Integer> {

	
	public CurrentUserSession findByUuid(String Uuid);
}
