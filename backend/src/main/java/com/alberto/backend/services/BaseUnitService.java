package com.alberto.backend.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.alberto.backend.entities.BaseUnit;
import com.alberto.backend.entities.MeasurementUnit;
import com.alberto.backend.repositories.BaseUnitRepository;
import com.alberto.backend.repositories.MeasurementUnitRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BaseUnitService {
    @Autowired
    private BaseUnitRepository baseUnitRepo;
    @Autowired
    private MeasurementUnitRepository measurementUnitRepo;

    public List<BaseUnit> getAll(){
        List<BaseUnit> baseUnitList = new ArrayList<BaseUnit>();

        baseUnitRepo.findAll().forEach(baseUnitList::add);

        return baseUnitList;
    }

    public BaseUnit create(BaseUnit baseUnit){
        baseUnit = baseUnitRepo.save(baseUnit);

        return baseUnit;
    }

    public BaseUnit update(BaseUnit baseUnit) {
        Optional<MeasurementUnit> measurementUnitData = measurementUnitRepo.findById(baseUnit.getDefaultMeasurementUnit().getId());
        if (measurementUnitData.isPresent()) {
            MeasurementUnit measurementUnit = measurementUnitData.get();
            baseUnit.setDefaultMeasurementUnit(measurementUnit);
        }

        baseUnit = baseUnitRepo.save(baseUnit);

        return baseUnit;
    }

    public BaseUnit findById(Integer baseUnitId) {
        return baseUnitRepo.findById(baseUnitId).orElse(null);
    }
}