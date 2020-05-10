package com.alberto.backend.repositories;

import com.alberto.backend.entities.MeasurementUnit;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeasurementUnitRepository extends CrudRepository<MeasurementUnit, Integer> {
    Page<MeasurementUnit> findByBaseUnitId(Integer baseUnitId, Pageable pageable);
}