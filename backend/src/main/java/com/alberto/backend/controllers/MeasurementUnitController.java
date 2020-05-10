package com.alberto.backend.controllers;


import com.alberto.backend.entities.BaseUnit;
import com.alberto.backend.entities.MeasurementUnit;
import com.alberto.backend.services.BaseUnitService;
import com.alberto.backend.services.MeasurementUnitService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping(value="/base-unit/{baseUnitId}/measurement-units")
public class MeasurementUnitController {
    @Autowired
    private MeasurementUnitService measurementUnitService;
    @Autowired
    private BaseUnitService baseUnitService;

    @GetMapping("")
    public Page<MeasurementUnit> getAllMeasurementUnits(@PathVariable(value = "baseUnitId") Integer baseUnitId, Pageable pageable) {
        return measurementUnitService.getAllMeasurementUnitsByBaseUnitId(baseUnitId, pageable);
    }

    @PostMapping(value="/add")
    public MeasurementUnit addMeasurementUnit(@PathVariable(value = "baseUnitId") Integer baseUnitId, @RequestBody MeasurementUnit measurementUnit) {
        BaseUnit baseUnit = baseUnitService.findById(baseUnitId);
        measurementUnit.setBaseUnit(baseUnit);

        measurementUnit = measurementUnitService.addMeasurementUnit(measurementUnit);
        
        return measurementUnit;
    }
    
}