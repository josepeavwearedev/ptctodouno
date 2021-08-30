package com.todouno.pruebatecnica.domain.model;

import lombok.Data;

@Data
public class Product {
    private String id;
    private String name;
    private String description;
    private Long quantity;

    public Product(String id, String name, String description, Long quantity) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
    }
}
