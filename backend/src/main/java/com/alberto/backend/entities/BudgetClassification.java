package com.alberto.backend.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class BudgetClassification {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    @OneToMany(mappedBy = "budgetClassification", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<BudgetClassificationDetail> budgetClassificationDetailList;

    public BudgetClassification() {}

    public BudgetClassification(int id, String name, Set<BudgetClassificationDetail> budgetClassificationDetailList) {
        this.id = id;
        this.name = name;
        this.budgetClassificationDetailList = budgetClassificationDetailList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<BudgetClassificationDetail> getBudgetClassificationDetailList() {
        return budgetClassificationDetailList;
    }

    public void setBudgetClassificationDetailList(Set<BudgetClassificationDetail> budgetClassificationDetailList) {
        this.budgetClassificationDetailList = budgetClassificationDetailList;
    }
}
