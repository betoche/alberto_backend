package com.alberto.backend.services;

import java.util.ArrayList;
import java.util.List;

import com.alberto.backend.entities.Currency;
import com.alberto.backend.repositories.CurrencyRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CurrencyService {
    @Autowired
    private CurrencyRepository currencyRepo;

    public List<Currency> getAllCurrencies(){
        List<Currency> currencyList = new ArrayList<Currency>();

        currencyRepo.findAll().forEach(currencyList::add);

        return currencyList;
    }

    public Currency addCurrency(Currency currency) {
        currency = currencyRepo.save(currency);
        return currency;
    }
}