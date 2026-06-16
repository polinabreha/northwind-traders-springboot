package com.pluralsight.northwind_traders_springboot.repository;

import com.pluralsight.northwind_traders_springboot.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Repository
public interface ProductsRepository extends JpaRepository<Products, Long> {

    List<Products> findByName(String name);
    List<Products> findByCategory(Integer category);
    List<Products> findByPrice(BigDecimal price);
    Optional<Products> findById(Long id);
}
