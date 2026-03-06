package com.interview.evaluation.controller;

import com.interview.evaluation.model.Interview;
import com.interview.evaluation.service.InterviewService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/interview")
@CrossOrigin
public class InterviewController {

    private final InterviewService interviewService;

    public InterviewController(InterviewService interviewService) {
        this.interviewService = interviewService;
    }

    @GetMapping
    public List<Interview> getAllInterviews() {
        return interviewService.getAllInterviews();
    }

    @PostMapping
    public Interview addInterview(@RequestBody Interview interview) {
        return interviewService.saveInterview(interview);
    }
}