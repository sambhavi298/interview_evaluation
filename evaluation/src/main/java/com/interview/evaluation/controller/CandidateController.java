package com.interview.evaluation.controller;

import com.interview.evaluation.model.Candidate;
import com.interview.evaluation.service.CandidateService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/candidate")
@CrossOrigin
public class CandidateController {

    private final CandidateService candidateService;

    public CandidateController(CandidateService candidateService) {
        this.candidateService = candidateService;
    }

    @GetMapping
    public List<Candidate> getAllCandidates() {
        return candidateService.getAllCandidates();
    }

    @PostMapping
    public Candidate addCandidate(@RequestBody Candidate candidate) {
        return candidateService.saveCandidate(candidate);
    }
}