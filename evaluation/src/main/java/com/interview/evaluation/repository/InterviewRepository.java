package com.interview.evaluation.repository;

import com.interview.evaluation.model.Interview;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InterviewRepository extends JpaRepository<Interview, Integer> {

}