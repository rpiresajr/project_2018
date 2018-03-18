package com.vanhack.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vanhack.api.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{
	
	Product findByName(String name);
	

}