package com.alberto.backend.controllers;

import java.util.List;

import com.alberto.backend.entities.Country;
import com.alberto.backend.services.CountryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/countries")
public class CountryController {
    @Autowired
    CountryService countryService;

    @GetMapping("/")
    public List<Country> getAll() {
        System.out.println("Inside Country Controller");

        return countryService.getAllCountries();
    }

    @PostMapping("/add")
    public Country add(@RequestBody Country country){
        return countryService.addCountry(country);
    }
}