package com.alberto.backend.repositories;

import javax.transaction.Transactional;

import com.alberto.backend.entities.AdministrativeDemarcation;

@Transactional
public interface AdministrativeDemarcationRepository extends AdministrativeDemarcationBaseRepository<AdministrativeDemarcation> {

}