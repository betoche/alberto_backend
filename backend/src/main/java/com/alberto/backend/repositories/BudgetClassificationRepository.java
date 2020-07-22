package com.alberto.backend.repositories;

import com.alberto.backend.entities.BudgetClassification;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BudgetClassificationRepository extends CrudRepository<BudgetClassification, Integer> {
}