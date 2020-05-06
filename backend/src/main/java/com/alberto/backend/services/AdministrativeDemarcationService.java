package com.alberto.backend.services;

import com.alberto.backend.entities.Department;
import com.alberto.backend.entities.AdministrativeDemarcation;
import com.alberto.backend.repositories.DepartmentRepository;
import com.alberto.backend.repositories.AdministrativeDemarcationRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdministrativeDemarcationService {
    @Autowired
    private AdministrativeDemarcationRepository territoryRepo;
    @Autowired
    private DepartmentRepository departmentRepo;

    public Department addDepartment( Department department ){
        department = departmentRepo.save(department);
        return department;
    }

    public AdministrativeDemarcation addTerritory( AdministrativeDemarcation territory ){
        territory = territoryRepo.save(territory);
        return territory;
    }
}