package com.rossato.couse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rossato.couse.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
  
}
