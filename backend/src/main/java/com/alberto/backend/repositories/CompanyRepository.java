package com.alberto.backend.repositories;

import javax.transaction.Transactional;

import com.alberto.backend.entities.Company;

import org.springframework.data.repository.CrudRepository;

@Transactional
public interface CompanyRepository extends UserBaseRepository<Company> {

}