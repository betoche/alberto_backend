package com.alberto.backend.repositories;

import com.alberto.backend.entities.BudgetClassificationDetail;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BudgetClassificationDetailRepository extends CrudRepository<BudgetClassificationDetail, Integer> {
    
}