package com.learnspring.learnspring.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Product {
    @Id
    @GeneratedValue
    private long id;
    private String price;
    private String name;

    public Product(long id, String price, String name) {
        this.id = id;
        this.price = price;
        this.name = name;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public String getPrice() {
        return price;
    }
}
