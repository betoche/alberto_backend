package com.alberto.backend.services;

import java.util.ArrayList;
import java.util.List;

import com.alberto.backend.entities.AdministrativeDemarcation;
import com.alberto.backend.entities.Country;
import com.alberto.backend.repositories.AdministrativeDemarcationRepository;
import com.alberto.backend.repositories.CountryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdministrativeDemarcationService {
    @Autowired
    private CountryRepository countryRepo;
    @Autowired
    private AdministrativeDemarcationRepository demarcationRepo;

    public AdministrativeDemarcation addDemarcation( AdministrativeDemarcation demarcation ){
        Country country = countryRepo.findById(demarcation.getCountry().getId()).orElse(null);
        if( country == null ){
            country = new Country();
        }
        country.setName(demarcation.getCountry().getName());
        demarcation.setCountry(country);

        return demarcationRepo.save(demarcation);
    }

    public List<AdministrativeDemarcation> getAllDemarcations() {
        List<AdministrativeDemarcation> demarcationList = new ArrayList<AdministrativeDemarcation>();
        demarcationRepo.findAll().forEach(demarcationList::add);

        return demarcationList;
    }
}