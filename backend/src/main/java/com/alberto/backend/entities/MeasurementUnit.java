package com.alberto.backend.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.FetchType;

import org.springframework.lang.NonNull;

@Entity
public class MeasurementUnit {
    @Id
    private int id;
    @NonNull
    private String name;
    private String abbreviation;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "base_unit_id", nullable = false)
    @JsonIgnore
    private BaseUnit baseUnit;
    @OneToOne(mappedBy = "defaultMeasurementUnit", cascade = CascadeType.ALL)
    private BaseUnit defaultBaseUnit;
    @OneToMany(mappedBy = "measurementUnit", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Consumption> consumptions;
    

    public MeasurementUnit(){}

    public MeasurementUnit(int id, String name, String abbreviation, BaseUnit baseUnit) {
        this.id = id;
        this.name = name;
        this.abbreviation = abbreviation;
        this.baseUnit = baseUnit;
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

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public BaseUnit getBaseUnit() {
        return baseUnit;
    }

    public void setBaseUnit(BaseUnit baseUnit) {
        this.baseUnit = baseUnit;
    }

    public BaseUnit getDefaultBaseUnit() {
        return defaultBaseUnit;
    }

    public void setDefaultBaseUnit(BaseUnit defaultBaseUnit) {
        this.defaultBaseUnit = defaultBaseUnit;
    }

    public Set<Consumption> getConsumptions() {
        return consumptions;
    }

    public void setConsumptions(Set<Consumption> consumptions) {
        this.consumptions = consumptions;
    }

    
}
