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
    private long id;
    @Column(name = "ProductName")
    @JsonProperty("name")
    private String name;
    @Column(name = "CategoryID")
    @JsonProperty("category")
    private String category;
    @Column(name = "UnitPrice")
    @JsonProperty("price")
    private BigDecimal price;


    public long getProductId() {
        return id;
    }

    public void setProductId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
