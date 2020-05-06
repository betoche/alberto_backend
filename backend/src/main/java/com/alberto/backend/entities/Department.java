package com.alberto.backend.entities;

import javax.persistence.Entity;

@Entity
public class Department extends AdministrativeDemarcation {

    public Department(int id, String name, Country country) {
        super(id, name, country);
    }
    
}