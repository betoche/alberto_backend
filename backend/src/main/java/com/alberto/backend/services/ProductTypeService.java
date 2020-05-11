package com.alberto.backend.services;

import java.util.Optional;

import com.alberto.backend.entities.Brand;
import com.alberto.backend.entities.ProductType;
import com.alberto.backend.repositories.BrandRepository;
import com.alberto.backend.repositories.ProductTypeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProductTypeService {
    @Autowired
    private ProductTypeRepository productTypeRepo;
    @Autowired
    private BrandRepository brandRepo;

    public Page<ProductType> getProductTypesByBrandId( Integer brandId, Pageable pageable ){
        return productTypeRepo.findByBrandId(brandId, pageable);
    }

    public ProductType createProductType( ProductType productType ){
        productType = productTypeRepo.save(productType);
        return productType;
    }

    public ProductType updateProductType( ProductType productType ) {
        Optional<Brand> productTypeData = brandRepo.findById(productType.getBrand().getId());

        if (productTypeData.isPresent()) {
            productType.setBrand(productTypeData.get());
            productType = productTypeRepo.save(productType);
        } else {
            productType = null;
        }

        return productType;
    }
}   