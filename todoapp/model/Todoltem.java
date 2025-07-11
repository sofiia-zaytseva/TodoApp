package com.example.todoapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Todoltem{

    @Id
    @GeneratedValue
    private Long id;
    private String titile;

    public Todoltem() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTtile() {
        return titile;
    }
}
