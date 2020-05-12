package com.alberto.backend.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class ConversionRate {
    @Id
    @GeneratedValue
    private long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "origin_currency_id", nullable = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Currency originCurrency;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "destination_currency_id", nullable = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Currency destinationCurrency;

    private double rate;
    private Date validityDate;

    public ConversionRate(){}

    //public ConversionRate(Currency originCurrency){
    //    this.originCurrency = originCurrency;
    //}

    public ConversionRate(Currency destinationCurrency){
        this.destinationCurrency = destinationCurrency;
    }

    public ConversionRate(Currency originCurrency, Currency destinationCurrency){
        this.originCurrency = originCurrency;
        this.destinationCurrency = destinationCurrency;
    }
    
    public ConversionRate( long id, Currency originCurrency, Currency destinationCurrency, double rate, Date date ){
        this.id = id;
        this.originCurrency = originCurrency;
        this.destinationCurrency = destinationCurrency;
        this.rate = rate;
        this.validityDate = date;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Currency getOriginCurrency() {
        return originCurrency;
    }

    public void setOriginCurrency(Currency originCurrency) {
        this.originCurrency = originCurrency;
    }

    public Currency getDestinationCurrency() {
        return destinationCurrency;
    }

    public void setDestinationCurrency(Currency destinationCurrency) {
        this.destinationCurrency = destinationCurrency;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public Date getValidityDate() {
        return validityDate;
    }

    public void setValidityDate(Date validityDate) {
        this.validityDate = validityDate;
    }
}
