package com.alberto.backend.repositories;

import com.alberto.backend.entities.BudgetConsumptionDetail;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BudgetConsumptionDetailRepository extends CrudRepository<BudgetConsumptionDetail, Integer> {

}