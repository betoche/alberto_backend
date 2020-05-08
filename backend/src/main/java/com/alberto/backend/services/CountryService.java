package com.alberto.backend.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.alberto.backend.entities.Country;
import com.alberto.backend.entities.Currency;
import com.alberto.backend.repositories.CountryRepository;
import com.alberto.backend.repositories.CurrencyRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService {
    @Autowired
    CountryRepository countryRepo;
    @Autowired
    CurrencyRepository currencyRepo;

    public List<Country> getAllCountries(){
        List<Country> countryList = new ArrayList<Country>();

        countryRepo.findAll().forEach(countryList::add);

        return countryList;
    }

    public Country addCountry( Country country ){
        country = countryRepo.save(country);
        return country;
    }

    public Country findById(Integer countryId) {
        return countryRepo.findById(countryId).get();
    }

    public Country updateCountry(Country country){
        Optional<Country> countryData = countryRepo.findById(country.getId());
        Optional<Currency> currencyData = currencyRepo.findById(country.getCurrency().getId());

        if( countryData.isPresent() ){
            Country c = countryData.get();
            c.setName(country.getName());
            if (currencyData.isPresent()){
                Currency currency = currencyData.get();
                c.setCurrency(currency);
            }
            country = countryRepo.save(c);
        }

        return country;
    }
}