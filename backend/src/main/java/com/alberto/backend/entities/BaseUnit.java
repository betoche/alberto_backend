package com.alberto.backend.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import org.springframework.lang.NonNull;

@Entity
public class BaseUnit {
    @Id
    @GeneratedValue
    private int id;
    @NonNull
    private String name;
    @OneToMany(mappedBy = "baseUnit", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<MeasurementUnit> measurementUnits;
    @OneToOne
    @JoinColumn(name = "default_measurement_unit_id", updatable = false)
    @JsonIgnore
    private MeasurementUnit defaultMeasurementUnit;

    public BaseUnit() {}
    
    public BaseUnit(int id, String name, Set<MeasurementUnit> measurementUnits, MeasurementUnit defaultMeasurementUnit) {
        this.id = id;
        this.name = name;
        this.measurementUnits = measurementUnits;
        this.defaultMeasurementUnit = defaultMeasurementUnit;
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

    public Set<MeasurementUnit> getMeasurementUnits() {
        return measurementUnits;
    }

    public void setMeasurementUnits(Set<MeasurementUnit> measurementUnits) {
        this.measurementUnits = measurementUnits;
    }

    public MeasurementUnit getDefaultMeasurementUnit() {
        return defaultMeasurementUnit;
    }

    public void setDefaultMeasurementUnit(MeasurementUnit defaultMeasurementUnit) {
        this.defaultMeasurementUnit = defaultMeasurementUnit;
    }

    

}
