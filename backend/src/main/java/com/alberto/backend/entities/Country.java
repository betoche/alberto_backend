package com.alberto.backend.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Country {
    @Id
    @GeneratedValue
    private int id;
    @Column
    private String name;
    @OneToMany(mappedBy = "country", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<AdministrativeDemarcation> demarcations;
    @OneToOne
    @JoinColumn( name = "currency_id", updatable = true)
    private Currency currency;

    public Country(int id, String name, Set<AdministrativeDemarcation> demarcations, Currency currency) {
        super();
        this.id = id;
        this.name = name;
        this.demarcations = demarcations;
        this.currency = currency;
    }

    public Country() {
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

    public Set<AdministrativeDemarcation> getAdministrativeDemarcations() {
        return demarcations;
    }

    public void setTerritories(Set<AdministrativeDemarcation> demarcations) {
        this.demarcations = demarcations;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
}