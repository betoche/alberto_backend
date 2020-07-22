package com.alberto.backend.repositories;

import com.alberto.backend.entities.Budget;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BudgetRepository extends CrudRepository<Budget, Integer> {
}