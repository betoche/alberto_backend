package com.alberto.backend.controllers;

import com.alberto.backend.entities.Country;
import com.alberto.backend.entities.Department;
import com.alberto.backend.services.CountryService;
import com.alberto.backend.services.DepartmentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    @Autowired
    private CountryService countryService;

    @GetMapping("/countries/{countryId}/departments")
    public Page<Department> getAllDepartmentsByCountryId( @PathVariable(value = "countryId") Integer countryId, Pageable pageable) {
        return departmentService.getAllDepartmentsByCountryId(countryId, pageable);
    }

    @PostMapping("/countries/{countryId}/departments")
    public Department createDepartment( @PathVariable(value = "countryId") Integer countryId, @Validated @RequestBody Department department ){
        Country country = countryService.findById(countryId);
        department.setCountry(country);
        return departmentService.addDepartment(department);
    }
}