package com.vanhack.api.services;

import java.util.List;

import com.vanhack.api.entitites.Product;


public interface ProductService {

	List<Product> listAll();
	
	Product findByName(String name);
	
	Product create (Product product);
	
	Product update (Product product);
	
	void remove (String name);
	
}
