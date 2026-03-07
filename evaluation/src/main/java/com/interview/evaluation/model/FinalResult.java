package com.interview.evaluation.model;

import jakarta.persistence.*;

@Entity
@Table(name = "final_result")
public class FinalResult {

    @Id
    @Column(name = "result_id")
    private int resultId;

    @Column(name = "final_score")
    private int finalScore;

    @Column(name = "selection_status")
    private String selectionStatus;

    @Column(name = "candidate_id")
    private int candidateId;

    public FinalResult(){}

    public int getResultId() {
        return resultId;
    }

    public void setResultId(int resultId) {
        this.resultId = resultId;
    }

    public int getFinalScore() {
        return finalScore;
    }

    public void setFinalScore(int finalScore) {
        this.finalScore = finalScore;
    }

    public String getSelectionStatus() {
        return selectionStatus;
    }

    public void setSelectionStatus(String selectionStatus) {
        this.selectionStatus = selectionStatus;
    }

    public int getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(int candidateId) {
        this.candidateId = candidateId;
    }
}