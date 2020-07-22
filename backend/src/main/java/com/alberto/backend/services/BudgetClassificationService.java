package com.alberto.backend.services;

import java.util.ArrayList;
import java.util.List;

import com.alberto.backend.entities.BudgetClassification;
import com.alberto.backend.repositories.BudgetClassificationRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BudgetClassificationService {
    @Autowired
    private BudgetClassificationRepository budgetClassificationRepo;

    public List<BudgetClassification> getAllClassification() {
        List<BudgetClassification> classificationList = new ArrayList<BudgetClassification>();

        budgetClassificationRepo.findAll().forEach(classificationList::add);

        return classificationList;
    }

    public BudgetClassification createBudgetClassification(BudgetClassification budgetClassification) {
        budgetClassification = budgetClassificationRepo.save(budgetClassification);

        return budgetClassification;
    }

    public BudgetClassification updateBudgetClassification( BudgetClassification budgetClassification ) {
        budgetClassification = budgetClassificationRepo.save(budgetClassification);

        return budgetClassification;
    }
}