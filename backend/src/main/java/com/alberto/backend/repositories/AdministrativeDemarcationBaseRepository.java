package com.alberto.backend.repositories;

import com.alberto.backend.entities.AdministrativeDemarcation;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface AdministrativeDemarcationBaseRepository<T extends AdministrativeDemarcation> extends CrudRepository<T, Integer>{

}