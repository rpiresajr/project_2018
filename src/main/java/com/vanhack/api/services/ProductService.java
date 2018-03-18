package com.vanhack.api.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vanhack.api.entities.Product;

@Service
public interface ProductService {

	List<Product> listAll();
	
	Product findByName(String name);
	
	Product create (Product product);
	
	Product update (Product product);
	
	void remove (String name);
	
}