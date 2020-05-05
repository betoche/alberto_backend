package com.alberto.backend.repositories;

import javax.transaction.Transactional;

import com.alberto.backend.entities.Person;

@Transactional
public interface PersonRepository extends UserBaseRepository<Person> {
    
}