package com.alberto.backend.repositories;

import com.alberto.backend.entities.Currency;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrencyRepository extends CrudRepository<Currency, Integer>{
    
}