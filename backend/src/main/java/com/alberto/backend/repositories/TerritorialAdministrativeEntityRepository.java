package com.alberto.backend.repositories;

import javax.transaction.Transactional;

import com.alberto.backend.entities.TerritorialAdministrativeEntity;

@Transactional
public interface TerritorialAdministrativeEntityRepository extends TerritorialAdministrativeEntityBaseRepository<TerritorialAdministrativeEntity> {

}