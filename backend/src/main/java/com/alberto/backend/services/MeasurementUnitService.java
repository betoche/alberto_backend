package com.alberto.backend.services;

import java.util.Optional;

import com.alberto.backend.entities.BaseUnit;
import com.alberto.backend.entities.MeasurementUnit;
import com.alberto.backend.repositories.BaseUnitRepository;
import com.alberto.backend.repositories.MeasurementUnitRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class MeasurementUnitService {
    @Autowired
    private MeasurementUnitRepository measurementUnitRepo;
    @Autowired
    private BaseUnitRepository baseUnitRepo;

    public Page<MeasurementUnit> getAllMeasurementUnitsByBaseUnitId(Integer baseUnitId, Pageable pageable){
        return measurementUnitRepo.findByBaseUnitId(baseUnitId, pageable);
    }

    public MeasurementUnit addMeasurementUnit( MeasurementUnit measurementUnit ){
        Optional<BaseUnit> baseUnitData = baseUnitRepo.findById(measurementUnit.getBaseUnit().getId());

        if( baseUnitData.isPresent() ){
            measurementUnit.setBaseUnit(baseUnitData.get());
            measurementUnit = measurementUnitRepo.save(measurementUnit);
        } else {
            measurementUnit = null;
        }
        
        return measurementUnit;
    }

    public MeasurementUnit updateMeasurementUnit( MeasurementUnit measurementUnit ) {
        Optional<BaseUnit> baseUnitData = baseUnitRepo.findById(measurementUnit.getBaseUnit().getId());

        if (baseUnitData.isPresent()) {
            measurementUnit.setBaseUnit(baseUnitData.get());
        }

        measurementUnit = measurementUnitRepo.save(measurementUnit);

        return measurementUnit;
    }
}