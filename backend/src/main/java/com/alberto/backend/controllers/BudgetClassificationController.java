package com.alberto.backend.controllers;

import java.util.List;

import com.alberto.backend.entities.BudgetClassification;
import com.alberto.backend.services.BudgetClassificationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sub-budgets")
public class BudgetClassificationController {
    @Autowired
    private BudgetClassificationService budgetClassificationService;

    @GetMapping("")
    public List<BudgetClassification> getAllClassifications(){
        return budgetClassificationService.getAllClassification();
    }

    @PostMapping("/add")
    public BudgetClassification createClassification(@Validated @RequestBody BudgetClassification classification ){
        return budgetClassificationService.createBudgetClassification(classification);
    }

    @PutMapping("/update/{classificationId}")
    public BudgetClassification updateClassification(@PathVariable(value = "classificationId") Integer classificationId, BudgetClassification classification){
        classification.setId(classificationId);
        return budgetClassificationService.updateBudgetClassification(classification);

    }

}