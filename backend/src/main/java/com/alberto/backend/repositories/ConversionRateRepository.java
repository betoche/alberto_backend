package com.alberto.backend.repositories;

import com.alberto.backend.entities.ConversionRate;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConversionRateRepository extends CrudRepository<ConversionRate, Long> {
    Page<ConversionRate> findByOriginCurrencyId(Integer originCurrencyId, Pageable pageable);
    //Page<ConversionRate> findByDestinationCurrencyId(Integer destinationCurrencyId, Pageable pageable);
}