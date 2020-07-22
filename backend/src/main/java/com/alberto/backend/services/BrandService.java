package com.alberto.backend.services;

import java.util.ArrayList;
import java.util.List;

import com.alberto.backend.entities.Brand;
import com.alberto.backend.repositories.BrandRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BrandService {
    @Autowired
    private BrandRepository brandRepo;

    public List<Brand> getAllBrands() {
        List<Brand> brandList = new ArrayList<Brand>();

        brandRepo.findAll().forEach(brandList::add);

        return brandList;
    }

    public Brand createBrand( Brand brand ) {
        brand = brandRepo.save(brand);

        return brand;
    }

    public Brand updateBrand( Brand brand ) {
        brand = brandRepo.save(brand);

        return brand;
    }
}