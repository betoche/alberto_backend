package com.alberto.backend.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import org.springframework.lang.NonNull;

@Entity
public class BaseUnit {
    @Id
    private int id;
    @NonNull
    private String name;
    @OneToMany(mappedBy = "baseUnit", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<MeasurementUnit> measurementUnits;
    @OneToOne
    @JoinColumn(name = "default_measurement_unit_id", updatable = false)
    @JsonIgnore
    private MeasurementUnit defaultMeasurementUnit;

}
