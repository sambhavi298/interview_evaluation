package com.interview.evaluation.service;

import com.interview.evaluation.model.FinalResult;
import com.interview.evaluation.repository.FinalResultRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FinalResultService {

    private final FinalResultRepository finalResultRepository;

    public FinalResultService(FinalResultRepository finalResultRepository) {
        this.finalResultRepository = finalResultRepository;
    }

    public List<FinalResult> getAllResults() {
        return finalResultRepository.findAll();
    }

    public FinalResult saveResult(FinalResult result) {
        return finalResultRepository.save(result);
    }
}