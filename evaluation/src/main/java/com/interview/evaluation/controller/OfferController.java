package com.interview.evaluation.controller;

import com.interview.evaluation.model.Offer;
import com.interview.evaluation.service.OfferService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/offer")
@CrossOrigin
public class OfferController {

    private final OfferService offerService;

    public OfferController(OfferService offerService) {
        this.offerService = offerService;
    }

    @GetMapping
    public List<Offer> getAllOffers() {
        return offerService.getAllOffers();
    }

    @PostMapping
    public Offer addOffer(@RequestBody Offer offer) {
        return offerService.saveOffer(offer);
    }
}