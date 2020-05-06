package com.alberto.backend.services;

import java.util.ArrayList;
import java.util.List;

import com.alberto.backend.entities.Country;
import com.alberto.backend.entities.Department;
import com.alberto.backend.repositories.CountryRepository;
import com.alberto.backend.repositories.DepartmentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
    @Autowired
    private CountryRepository countryRepo;
    @Autowired
    private DepartmentRepository departmentRepo;

    public Department addDepartment( Department department ){
        Country country = countryRepo.findById(department.getCountry().getId()).orElse(null);
        if( country == null ){
            country = new Country();
        }
        country.setName(department.getCountry().getName());
        department.setCountry(country);
        
        return departmentRepo.save(department);
    }

    public Page<Department> getAllDepartmentsByCountryId(Integer countryId, Pageable pageable) {
        return departmentRepo.findByCountryId(countryId, pageable);
    }

    public List<Department> getAllDepartments() {
        List<Department> departmentList = new ArrayList<Department>();
        departmentRepo.findAll().forEach(departmentList::add);

        return departmentList;
    }
}