package com.alberto.backend.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import org.springframework.lang.NonNull;

@Entity
public class Currency {
    @Id
    @GeneratedValue
    private int id;
    @NonNull
    private String name;
    private String symbol;
    private String code;
    @OneToOne(mappedBy = "currency", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnore
    private Country country;
    @OneToMany(mappedBy = "currency", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Consumption> consumptions;

    @OneToMany(mappedBy = "originCurrency", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<ConversionRate> originCurrencies;
    @OneToMany(mappedBy = "destinationCurrency", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<ConversionRate> destinationCurrencies;

    public Currency(){}

    public Currency(int id, String name, String symbol, String code, Country country) {
        this.id = id;
        this.name = name;
        this.symbol = symbol;
        this.code = code;
        this.country = country;
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

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Set<Consumption> getConsumptions() {
        return consumptions;
    }

    public void setConsumptions(Set<Consumption> consumptions) {
        this.consumptions = consumptions;
    }

    public Set<ConversionRate> getOriginCurrencies() {
        return originCurrencies;
    }

    public void setOriginCurrencies(Set<ConversionRate> originCurrencies) {
        this.originCurrencies = originCurrencies;
    }

    public Set<ConversionRate> getDestinationCurrencies() {
        return destinationCurrencies;
    }

    public void setDestinationCurrencies(Set<ConversionRate> destinationCurrencies) {
        this.destinationCurrencies = destinationCurrencies;
    }

}
