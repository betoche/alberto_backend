package com.alberto.backend.entities;

import javax.persistence.Entity;

@Entity
public class Company extends User {
    private String name;
    private int employees;

    public Company(long id, String email, String name, int employees) {
        super(id, email);
        this.name = name;
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployees() {
        return employees;
    }

    public void setEmployees(int employees) {
        this.employees = employees;
    }
}