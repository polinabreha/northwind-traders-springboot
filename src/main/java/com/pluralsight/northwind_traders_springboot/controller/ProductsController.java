package com.pluralsight.northwind_traders_springboot.controller;


import com.pluralsight.northwind_traders_springboot.model.Products;
import com.pluralsight.northwind_traders_springboot.service.ProductsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductsController {
    private final ProductsService productService;
    public ProductsController(ProductsService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Products> getProducts(){return productService.getAllProducts();}

    @GetMapping("/{id}")
    public ResponseEntity<Products> getProductById(@PathVariable long id){
        return productService.getProductById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/name/{name}")
    public List<Products> getProductsByName(@PathVariable String name){
        return productService.getProductByName(name);
    }

    @GetMapping("/category/{category}")
    public List<Products> getProductsByCategory(@PathVariable Integer category){
        return productService.getProductByCategory(category);
    }

    @GetMapping("/price/{price}")
    public List<Products> getProductsByPrice(@PathVariable BigDecimal price){
        return productService.getProductByPrice(price);
    }

    @PostMapping
    public Products createProduct(@RequestBody Products product) {
        return productService.createProducts(product);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable long id) {
        productService.deleteProductById(id);
        return ResponseEntity.noContent().build();
    }
}
