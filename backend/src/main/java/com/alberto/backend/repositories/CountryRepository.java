package com.alberto.backend.repositories;

import com.alberto.backend.entities.Country;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends CrudRepository<Country, Integer> {

}