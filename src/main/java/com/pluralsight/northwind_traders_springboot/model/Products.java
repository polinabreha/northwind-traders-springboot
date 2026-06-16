package com.pluralsight.northwind_traders_springboot.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "Products")
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "ProductID")
    @JsonProperty("id")
    private Long id;
    @Column(name = "ProductName")
    @JsonProperty("name")
    private String name;
    @Column(name = "CategoryID")
    @JsonProperty("category")
    private int category;
    @Column(name = "UnitPrice")
    @JsonProperty("price")
    private BigDecimal price;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
