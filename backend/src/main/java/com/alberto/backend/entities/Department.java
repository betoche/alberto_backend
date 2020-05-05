package com.alberto.backend.entities;

import javax.persistence.Entity;

@Entity
public class Department extends TerritorialAdministrativeEntity {

    public Department(int id, String name) {
        super(id, name);
    }
    
}