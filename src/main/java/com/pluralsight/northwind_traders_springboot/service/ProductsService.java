package com.pluralsight.northwind_traders_springboot.service;

import com.pluralsight.northwind_traders_springboot.model.Products;
import com.pluralsight.northwind_traders_springboot.repository.ProductsRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class ProductsService {
    private final ProductsRepository productsRepository;

    public ProductsService(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    public List<Products> getAllProducts(){return productsRepository.findAll();}

    public Optional<Products> getProductById(Long id){return productsRepository.findById(id);}

    public Products createProducts(Products product){return productsRepository.save(product);}

    public void deleteProductById(long id){
        productsRepository.deleteById(id);
    }

    public List <Products> getProductByName(String name){return productsRepository.findByName(name);}

    public List <Products> getProductByCategory(int category){return productsRepository.findByCategory(category);}

    public List <Products> getProductByPrice (BigDecimal price){return productsRepository.findByPrice(price);}

}
