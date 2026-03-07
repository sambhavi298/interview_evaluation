package com.interview.evaluation.controller;

import com.interview.evaluation.model.FinalResult;
import com.interview.evaluation.service.FinalResultService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/result")
@CrossOrigin
public class FinalResultController {

    private final FinalResultService finalResultService;

    public FinalResultController(FinalResultService finalResultService) {
        this.finalResultService = finalResultService;
    }

    @GetMapping
    public List<FinalResult> getAllResults() {
        return finalResultService.getAllResults();
    }

    @PostMapping
    public FinalResult addResult(@RequestBody FinalResult result) {
        return finalResultService.saveResult(result);
    }
}