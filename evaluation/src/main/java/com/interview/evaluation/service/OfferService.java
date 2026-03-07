package com.interview.evaluation.service;

import com.interview.evaluation.model.Offer;
import com.interview.evaluation.repository.OfferRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OfferService {

    private final OfferRepository offerRepository;

    public OfferService(OfferRepository offerRepository) {
        this.offerRepository = offerRepository;
    }

    public List<Offer> getAllOffers() {
        return offerRepository.findAll();
    }

    public Offer saveOffer(Offer offer) {
        return offerRepository.save(offer);
    }
}