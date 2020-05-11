package com.alberto.backend.controllers;

import java.util.List;

import com.alberto.backend.entities.Brand;
import com.alberto.backend.services.BrandService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/brands")
public class BrandController {
    @Autowired
    private BrandService brandService;

    @GetMapping("")
    public List<Brand> getAllBrands() {
        return brandService.getAllBrands();
    }

    @PostMapping("/add")
    public Brand createBrand(@Validated @RequestBody Brand brand){
        return brandService.createBrand(brand);
    }

    @PutMapping("/update/{brandId}")
    public Brand updateBrand( @PathVariable(value = "brandId") Integer brandId, @Validated @RequestBody Brand brand ){
        brand.setId(brandId);
        return brandService.updateBrand(brand);
    }
}
