package com.alberto.backend.entities;

import java.util.Date;
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
public class Budget{
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private Date initialDate;
    private Date finalDate;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id")
    @JsonIgnore
    private User user;
    @OneToMany(mappedBy = "budget", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<BudgetClassificationDetail> budgetClassificationDetails;
    private double total;

    public Budget() {}

    public Budget(int id, String name, Date initialDate, Date finalDate, User user, Set<BudgetClassificationDetail> budgetClassificationDetails, double total) {
        this.id = id;
        this.name = name;
        this.initialDate = initialDate;
        this.user = user;
        this.budgetClassificationDetails = budgetClassificationDetails;
        this.total = total;
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

    public Date getInitialDate() {
        return initialDate;
    }

    public void setInitialDate(Date initialDate) {
        this.initialDate = initialDate;
    }

    public Date getFinalDate() {
        return finalDate;
    }

    public void setFinalDate(Date finalDate) {
        this.finalDate = finalDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<BudgetClassificationDetail> getBudgetClassificationDetails() {
        return budgetClassificationDetails;
    }

    public void setBudgetClassificationDetails(Set<BudgetClassificationDetail> budgetClassificationDetails) {
        this.budgetClassificationDetails = budgetClassificationDetails;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    
}