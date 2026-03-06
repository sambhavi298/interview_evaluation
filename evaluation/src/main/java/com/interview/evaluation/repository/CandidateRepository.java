package com.interview.evaluation.repository;

import com.interview.evaluation.model.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateRepository extends JpaRepository<Candidate,Integer> {

}