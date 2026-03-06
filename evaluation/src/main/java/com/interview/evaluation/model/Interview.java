package com.interview.evaluation.model;

import jakarta.persistence.*;

@Entity
@Table(name = "interview")
public class Interview {

    @Id
    @Column(name = "interview_id")
    private int interviewId;

    @Column(name = "interview_date")
    private String interviewDate;

    @Column(name = "interview_mode")
    private String interviewMode;

    @Column(name = "location")
    private String location;

    public Interview() {}

    public int getInterviewId() {
        return interviewId;
    }

    public void setInterviewId(int interviewId) {
        this.interviewId = interviewId;
    }

    public String getInterviewDate() {
        return interviewDate;
    }

    public void setInterviewDate(String interviewDate) {
        this.interviewDate = interviewDate;
    }

    public String getInterviewMode() {
        return interviewMode;
    }

    public void setInterviewMode(String interviewMode) {
        this.interviewMode = interviewMode;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}