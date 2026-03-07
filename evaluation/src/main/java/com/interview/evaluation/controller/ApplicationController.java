package com.interview.evaluation.controller;

import com.interview.evaluation.model.Application;
import com.interview.evaluation.service.ApplicationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/application")
@CrossOrigin
public class ApplicationController {

    private final ApplicationService applicationService;

    public ApplicationController(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    @GetMapping
    public List<Application> getAllApplications() {
        return applicationService.getAllApplications();
    }

    @PostMapping
    public Application addApplication(@RequestBody Application application) {
        return applicationService.saveApplication(application);
    }
}