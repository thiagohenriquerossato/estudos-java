package com.rossato.couse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rossato.couse.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
  
}
