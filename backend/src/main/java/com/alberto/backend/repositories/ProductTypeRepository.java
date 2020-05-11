package com.alberto.backend.repositories;

import com.alberto.backend.entities.ProductType;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductTypeRepository extends CrudRepository<ProductType, Integer> {

    Page<ProductType> findByBrandId(Integer brandId, Pageable pageable);

}