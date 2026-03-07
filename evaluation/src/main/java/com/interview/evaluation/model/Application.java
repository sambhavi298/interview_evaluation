package com.interview.evaluation.model;

import jakarta.persistence.*;

@Entity
@Table(name = "application")
public class Application {

    @Id
    @Column(name = "application_id")
    private int applicationId;

    @Column(name = "application_date")
    private String applicationDate;

    @Column(name = "application_status")
    private String applicationStatus;

    @Column(name = "candidate_id")
    private int candidateId;

    @Column(name = "job_id")
    private int jobId;

    public Application(){}

    public int getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(int applicationId) {
        this.applicationId = applicationId;
    }

    public String getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(String applicationDate) {
        this.applicationDate = applicationDate;
    }

    public String getApplicationStatus() {
        return applicationStatus;
    }

    public void setApplicationStatus(String applicationStatus) {
        this.applicationStatus = applicationStatus;
    }

    public int getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(int candidateId) {
        this.candidateId = candidateId;
    }

    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }
}