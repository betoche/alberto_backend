package com.alberto.backend.repositories;

import com.alberto.backend.entities.BaseUnit;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BaseUnitRepository extends CrudRepository<BaseUnit, Integer> {
}