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
public abstract class AdministrativeDemarcation {
    @Id
    @GeneratedValue
    private int id;
    @NonNull
    private String name;
    
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "country_id", nullable = false)
    @JsonIgnore
    private Country country;
    
	public AdministrativeDemarcation(int id, String name, Country country) {
        this.id = id;
        this.name = name;
	}

    public AdministrativeDemarcation() {
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

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}