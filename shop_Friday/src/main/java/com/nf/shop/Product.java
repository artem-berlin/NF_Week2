package com.nf.shop;

import java.util.Objects;

public class Product {

    private String id;
    private String name;

    public Product(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}