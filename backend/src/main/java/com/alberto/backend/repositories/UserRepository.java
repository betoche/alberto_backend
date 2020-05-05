package com.alberto.backend.repositories;

import javax.transaction.Transactional;

import com.alberto.backend.entities.User;

@Transactional
public interface UserRepository extends UserBaseRepository<User> {
    
}