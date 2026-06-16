package com.pluralsight.northwind_traders_springboot.service;

import com.pluralsight.northwind_traders_springboot.model.Product;
import com.pluralsight.northwind_traders_springboot.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts(){return productRepository.findAll();}

    public Optional<Product> getProductById(Long id){return productRepository.findById(id);}

    public Product createProducts(Product product){return productRepository.save(product);}

    public void deleteProductById(Long id){productRepository.deleteById(id);}

    public List <Product> getProductByName(String name){return productRepository.findByName(name);}

    public List <Product> getProductByCategory(String category){return productRepository.findByCategory(category);}

    public List <Product> getProductByPrice (BigDecimal price){return productRepository.findByPrice(price);}

}
