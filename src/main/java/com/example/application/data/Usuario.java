package com.example.application.data;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.Email;

@Entity
public class Usuario extends AbstractEntity {

    @Email
    private String email;
    private String name;
    private String lastname;

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

}
