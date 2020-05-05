package com.alberto.backend.repositories;

import com.alberto.backend.entities.TerritorialAdministrativeEntity;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface TerritorialAdministrativeEntityBaseRepository<T extends TerritorialAdministrativeEntity> extends CrudRepository<T, Integer>{

}