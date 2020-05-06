package com.alberto.backend.repositories;

import javax.transaction.Transactional;

import com.alberto.backend.entities.Department;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@Transactional
public interface DepartmentRepository extends AdministrativeDemarcationBaseRepository<Department>{
    Page<Department> findByCountryId(Integer countryId, Pageable pageable);
}