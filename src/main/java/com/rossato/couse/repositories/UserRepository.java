package com.rossato.couse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rossato.couse.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
  
}
