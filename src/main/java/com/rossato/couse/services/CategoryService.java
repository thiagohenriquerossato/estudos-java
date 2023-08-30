package com.rossato.couse.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rossato.couse.entities.Category;
import com.rossato.couse.repositories.CategoryRepository;

@Service
public class CategoryService {
  
  @Autowired
  private CategoryRepository repository;

  public List<Category> findAll() {
    return repository.findAll();
  }
  
}
