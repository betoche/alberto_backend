package com.alberto.backend.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import org.springframework.lang.NonNull;

@Entity
@Inheritance
public abstract class Consumption {
    @Id
    @GeneratedValue
    private int id;
    @NonNull
    private String name;
    private String description;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "measurement_unit_id")
    @JsonIgnore
    private MeasurementUnit measurementUnit;
    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "currency_id")
    @JsonIgnore
    private Currency currency;
    private float basePrice;

    public Consumption(){}
    public Consumption(int id, String name, String description, MeasurementUnit measurementUnit, Currency currency, float basePrice){
        this.id = id;
        this.name = name;
        this.description = description;
        this.measurementUnit = measurementUnit;
        this.currency = currency;
        this.basePrice = basePrice;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public MeasurementUnit getMeasurementUnit() {
        return measurementUnit;
    }

    public void setMeasurementUnit(MeasurementUnit measurementUnit) {
        this.measurementUnit = measurementUnit;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public float getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(float basePrice) {
        this.basePrice = basePrice;
    }

    
}