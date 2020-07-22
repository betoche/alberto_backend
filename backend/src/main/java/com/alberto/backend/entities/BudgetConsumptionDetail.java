package com.alberto.backend.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class BudgetConsumptionDetail {
    @Id
    @GeneratedValue
    private int id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "consumption_id", nullable = false)
    private Consumption consumption;

    private double quantity;
    private double nominalPrice;
    private double total;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "budget_classification_detail_id", nullable = false)
    private BudgetClassificationDetail budgetClassificationDetail;

    public BudgetConsumptionDetail() {}
    public BudgetConsumptionDetail(int id, Consumption consumption, double quantity, double nominalPrice, double total) {
        this.id = id;
        this.consumption = consumption;
        this.quantity = quantity;
        this.nominalPrice = nominalPrice;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Consumption getConsumption() {
        return consumption;
    }

    public void setConsumption(Consumption consumption) {
        this.consumption = consumption;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getNominalPrice() {
        return nominalPrice;
    }

    public void setNominalPrice(double nominalPrice) {
        this.nominalPrice = nominalPrice;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public BudgetClassificationDetail getBudgetClassificationDetail() {
        return budgetClassificationDetail;
    }

    public void setBudgetClassificationDetail(BudgetClassificationDetail budgetClassificationDetail) {
        this.budgetClassificationDetail = budgetClassificationDetail;
    }
}
