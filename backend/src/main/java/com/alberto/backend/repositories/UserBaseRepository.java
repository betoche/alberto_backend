package com.alberto.backend.repositories;

import com.alberto.backend.entities.User;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface UserBaseRepository<T extends User> extends CrudRepository<T, Long> {
    public T findByEmail(String email);
}