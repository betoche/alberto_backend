package com.alberto.backend.repositories;

import javax.transaction.Transactional;

import com.alberto.backend.entities.Department;

@Transactional
public interface DepartmentRepository extends AdministrativeDemarcationBaseRepository<Department>{
    
}