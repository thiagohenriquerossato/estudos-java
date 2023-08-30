package com.rossato.couse.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rossato.couse.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
  
  @GetMapping
  public ResponseEntity<User> findAll() {
    User user = new User(1L, "Maria", "", "", "");
    return ResponseEntity.ok().body(user);
  }
}
