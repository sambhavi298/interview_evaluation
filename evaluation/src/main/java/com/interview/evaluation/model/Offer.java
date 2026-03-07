package com.interview.evaluation.model;

import jakarta.persistence.*;

@Entity
@Table(name = "offer")
public class Offer {

    @Id
    @Column(name = "offer_id")
    private int offerId;

    @Column(name = "offer_date")
    private String offerDate;

    @Column(name = "offered_salary")
    private String offeredSalary;

    @Column(name = "joining_date")
    private String joiningDate;

    @Column(name = "application_id")
    private int applicationId;

    public Offer(){}

    public int getOfferId() {
        return offerId;
    }

    public void setOfferId(int offerId) {
        this.offerId = offerId;
    }

    public String getOfferDate() {
        return offerDate;
    }

    public void setOfferDate(String offerDate) {
        this.offerDate = offerDate;
    }

    public String getOfferedSalary() {
        return offeredSalary;
    }

    public void setOfferedSalary(String offeredSalary) {
        this.offeredSalary = offeredSalary;
    }

    public String getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(String joiningDate) {
        this.joiningDate = joiningDate;
    }

    public int getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(int applicationId) {
        this.applicationId = applicationId;
    }
}