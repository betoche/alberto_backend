package com.alberto.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Optional;

import com.alberto.backend.entities.ConversionRate;
import com.alberto.backend.entities.Currency;
import com.alberto.backend.repositories.ConversionRateRepository;
import com.alberto.backend.repositories.CurrencyRepository;

@Service
public class ConversionRateService {
    @Autowired
    private ConversionRateRepository conversionRateRepo;
    @Autowired
    private CurrencyRepository currencyRepo;
    private Calendar currentCal;

    public Page<ConversionRate> getAllConversionRatesByOriginCurrencyId(Integer originCurrencyId, Pageable pageable){
        return conversionRateRepo.findByOriginCurrencyId(originCurrencyId, pageable);
    }

    //public Page<ConversionRate> getAllConversionRatesByDestinationCurrencyId( Integer destinationCurrencyId, Pageable pageable ){
    //    return conversionRateRepo.findByDestinationCurrencyId(destinationCurrencyId, pageable);
    //}

    public ConversionRate createConversionRate( ConversionRate conversionRate ){
        Optional<Currency> originCurrencyData = currencyRepo.findById(conversionRate.getOriginCurrency().getId());
        Optional<Currency> destinationCurrencyData = currencyRepo.findById(conversionRate.getDestinationCurrency().getId());

        if (originCurrencyData.isPresent() && destinationCurrencyData.isPresent()) {
            conversionRate.setOriginCurrency(originCurrencyData.get());
            conversionRate.setDestinationCurrency(destinationCurrencyData.get());
            if( conversionRate.getValidityDate() == null ){
                conversionRate.setValidityDate(getCurrentCalendar().getTime());
            }
            conversionRate = conversionRateRepo.save(conversionRate);
        } else {
            conversionRate = null;
        }

        return conversionRate;
    }

    private Calendar getCurrentCalendar(){
        if ( currentCal == null ) {
            currentCal = Calendar.getInstance();
        }

        return currentCal;
    }
}