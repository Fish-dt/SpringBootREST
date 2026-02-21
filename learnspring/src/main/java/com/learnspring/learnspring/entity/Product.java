package com.learnspring.learnspring.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Product {
    @Id
    @GeneratedValue
    private Long id;
    private String price;
    private String name;

    public Product(Long id, String price, String name) {
        this.id = id;
        this.price = price;
        this.name = name;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public String getPrice() {
        return price;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
