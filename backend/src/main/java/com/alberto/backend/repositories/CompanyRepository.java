package com.alberto.backend.repositories;

import javax.transaction.Transactional;

import com.alberto.backend.entities.Company;

@Transactional
public interface CompanyRepository extends UserBaseRepository<Company> {

}