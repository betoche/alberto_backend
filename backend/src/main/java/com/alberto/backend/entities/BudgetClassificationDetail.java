package com.alberto.backend.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class BudgetClassificationDetail {
    @Id
    @GeneratedValue
    private int id;
    @ManyToOne
    @JoinColumn(name = "budget_clasification_id", nullable = false)
    private BudgetClassification budgetClassification;
    @ManyToOne
    @JoinColumn(name = "budget_id", nullable = false)
    @JsonIgnore
    private Budget budget;
    @OneToMany(mappedBy = "budgetClassificationDetail", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<BudgetConsumptionDetail> budgetConsumptionDetailList;
    private double total;

    public BudgetClassificationDetail() {}

    public BudgetClassificationDetail(int id, Budget budget, BudgetClassification budgetClassification, Set<BudgetConsumptionDetail> budgetConsumptionDetailList, double total) {
        this.id = id;
        this.budgetClassification = budgetClassification;
        this.budget = budget;
        this.budgetConsumptionDetailList = budgetConsumptionDetailList;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BudgetClassification getBudgetClassification() {
        return budgetClassification;
    }

    public void setBudgetClassification(BudgetClassification budgetClassification) {
        this.budgetClassification = budgetClassification;
    }

    public Budget getBudget() {
        return budget;
    }

    public void setBudget(Budget budget) {
        this.budget = budget;
    }

    public Set<BudgetConsumptionDetail> getBudgetConsumptionDetailList() {
        return budgetConsumptionDetailList;
    }

    public void setBudgetConsumptionDetailList(Set<BudgetConsumptionDetail> budgetConsumptionDetailList) {
        this.budgetConsumptionDetailList = budgetConsumptionDetailList;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
