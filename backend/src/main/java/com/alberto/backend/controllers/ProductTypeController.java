package com.alberto.backend.controllers;

import com.alberto.backend.entities.Brand;
import com.alberto.backend.entities.ProductType;
import com.alberto.backend.services.ProductTypeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/brands/{brandId}/product-types")
public class ProductTypeController {
    @Autowired
    private ProductTypeService productTypeService;

    @GetMapping("")
    public Page<ProductType> getAllProductTypes(@PathVariable(value = "brandId") Integer brandId, Pageable pageable){
        return productTypeService.getProductTypesByBrandId(brandId, pageable);
    }

    @PostMapping("/add")
    public ProductType createProductType(@PathVariable(value = "brandId") Integer brandId, @RequestBody ProductType productType) {
        Brand brand = new Brand();
        brand.setId(brandId);
        productType.setBrand(brand);
        return productTypeService.createProductType(productType);
    }

    @PutMapping("/update")
    public ProductType updateProductType(@PathVariable(value = "brandId") Integer brandId, @RequestBody ProductType productType) {
        Brand brand = new Brand();
        brand.setId(brandId);
        productType.setBrand(brand);
        return productTypeService.updateProductType(productType);
    }

}