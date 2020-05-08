package com.alberto.backend.controllers;

import java.util.List;

import com.alberto.backend.entities.Currency;
import com.alberto.backend.services.CurrencyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("currencies")
public class CurrencyController {
    @Autowired
    private CurrencyService currencyService;

    @GetMapping("")
    public List<Currency> getAllCurrencies(){
        System.out.println( "Inside Currency Controller" );

        return currencyService.getAllCurrencies();
    }

    @PostMapping("/add")
    public Currency add(@RequestBody Currency currency){
        return currencyService.addCurrency(currency);
    }

}