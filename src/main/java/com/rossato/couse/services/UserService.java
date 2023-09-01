package com.rossato.couse.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rossato.couse.entities.User;
import com.rossato.couse.repositories.UserRepository;

@Service
public class UserService {
  
  @Autowired
  private UserRepository repository;

  public List<User> findAll() {
    return repository.findAll();
  }
  
  public User findById(Long id) {
    return repository.findById(id).get();
  }

  public User insert(User obj) {
    return repository.save(obj);
  }
}
