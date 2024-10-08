package com.nischitha.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.nischitha.model.Feedback;

public interface FeedbackRepo extends JpaRepository<Feedback, Integer> {


}

