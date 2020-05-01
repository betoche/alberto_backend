package com.alberto.backend.services;

import java.util.ArrayList;
import java.util.List;

import com.alberto.backend.entities.Country;
import com.alberto.backend.repositories.CountryRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService {
    @Autowired
    CountryRepo countryRepo;

    public List<Country> getAllCountries(){
        List<Country> countryList = new ArrayList<Country>();

        countryRepo.findAll().forEach(countryList::add);

        return countryList;
    }

    public Country addCountry( Country country ){
        country = countryRepo.save(country);
        return country;
    }


}