package com.lidp.fare.controller;

import com.lidp.fare.domain.Fare;
import com.lidp.fare.service.FareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/fares")
public class FareController {

    private final FareService fareService;

    @Autowired
    public FareController(FareService fareService) {
        this.fareService = fareService;
    }

    @GetMapping("/")
    public List<Fare> getAllFares() {
        return fareService.getAllFares();
    }

    @GetMapping("/{id}")
    public Fare getFareById(@PathVariable("id") Long id) {
        return fareService.getFareById(id);
    }
}
