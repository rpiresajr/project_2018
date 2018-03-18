package com.vanhack.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vanhack.api.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
    
}

