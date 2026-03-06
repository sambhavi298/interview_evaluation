package com.interview.evaluation.service;

import com.interview.evaluation.model.Interview;
import com.interview.evaluation.repository.InterviewRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InterviewService {

    private final InterviewRepository interviewRepository;

    public InterviewService(InterviewRepository interviewRepository) {
        this.interviewRepository = interviewRepository;
    }

    public List<Interview> getAllInterviews() {
        return interviewRepository.findAll();
    }

    public Interview saveInterview(Interview interview) {
        return interviewRepository.save(interview);
    }
}