package com.alberto.backend.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;

import org.springframework.lang.NonNull;

@Entity
@Inheritance
public abstract class User {
    @Id
    private long id;

    @NonNull
    private String email;

    public User(long id, String email) {
        this.id = id;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}