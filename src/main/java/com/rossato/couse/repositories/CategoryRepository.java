package com.rossato.couse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rossato.couse.entities.Category;

public interface CategoryRepository  extends JpaRepository<Category, Long>{
  
}
