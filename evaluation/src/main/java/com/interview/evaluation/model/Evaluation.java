package com.interview.evaluation.model;

import jakarta.persistence.*;

@Entity
@Table(name = "evaluation")
public class Evaluation {

    @Id
    @Column(name = "evaluation_id")
    private int evaluationId;

    @Column(name = "technical_score")
    private int technicalScore;

    @Column(name = "communication_score")
    private int communicationScore;

    @Column(name = "problem_solving_score")
    private int problemSolvingScore;

    @Column(name = "total_score")
    private int totalScore;

    @Column(name = "candidate_round_id")
    private int candidateRoundId;

    @Column(name = "interviewer_id")
    private int interviewerId;

    public Evaluation(){}

    public int getEvaluationId() {
        return evaluationId;
    }

    public void setEvaluationId(int evaluationId) {
        this.evaluationId = evaluationId;
    }

    public int getTechnicalScore() {
        return technicalScore;
    }

    public void setTechnicalScore(int technicalScore) {
        this.technicalScore = technicalScore;
    }

    public int getCommunicationScore() {
        return communicationScore;
    }

    public void setCommunicationScore(int communicationScore) {
        this.communicationScore = communicationScore;
    }

    public int getProblemSolvingScore() {
        return problemSolvingScore;
    }

    public void setProblemSolvingScore(int problemSolvingScore) {
        this.problemSolvingScore = problemSolvingScore;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    public int getCandidateRoundId() {
        return candidateRoundId;
    }

    public void setCandidateRoundId(int candidateRoundId) {
        this.candidateRoundId = candidateRoundId;
    }

    public int getInterviewerId() {
        return interviewerId;
    }

    public void setInterviewerId(int interviewerId) {
        this.interviewerId = interviewerId;
    }
}