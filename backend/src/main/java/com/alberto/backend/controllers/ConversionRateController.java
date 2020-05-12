package com.alberto.backend.controllers;

import com.alberto.backend.entities.ConversionRate;
import com.alberto.backend.entities.Currency;
import com.alberto.backend.services.ConversionRateService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/currencies/{originCurrencyId}/rates")
public class ConversionRateController {
    @Autowired
    private ConversionRateService conversionRateService;

    @GetMapping("")
    public Page<ConversionRate> getConversionRatesByOriginCurrencyId(@PathVariable(value = "originCurrencyId") Integer originCurrencyId, Pageable pageable){
        return conversionRateService.getAllConversionRatesByOriginCurrencyId(originCurrencyId, pageable);
    }

    @PostMapping("/add")
    public ConversionRate addConversionRate( @PathVariable(value = "originCurrencyId") Integer originCurrencyId, @RequestBody ConversionRate conversionRate ){
        Currency currency = new Currency();
        currency.setId(originCurrencyId);
        conversionRate.setOriginCurrency(currency);
        return conversionRateService.createConversionRate(conversionRate);
    }
}