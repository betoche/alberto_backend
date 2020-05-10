package com.alberto.backend.controllers;

import java.util.List;

import com.alberto.backend.entities.BaseUnit;
import com.alberto.backend.services.BaseUnitService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("base-unit")
public class BaseUnitController {
    @Autowired
    private BaseUnitService baseUnitService;

    @GetMapping("")
    public List<BaseUnit> getAllBaseUnits(){
        System.out.println("Inside BaseUnit controller!");
        return baseUnitService.getAll();
    }

    @PostMapping("/add")
    public BaseUnit createBaseUnit(@RequestBody BaseUnit baseUnit){
        return baseUnitService.create(baseUnit);
    }

    @PutMapping(value="/update/{baseUnitId}")
    public BaseUnit updateBaseUnit(@PathVariable(value = "baseUnitId") Integer baseUnitId, @RequestBody BaseUnit baseUnit) {
        baseUnit.setId(baseUnitId);
        return baseUnitService.update(baseUnit);
    }
}