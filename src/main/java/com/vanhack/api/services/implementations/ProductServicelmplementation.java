package com.vanhack.api.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.vanhack.api.entitites.Product;
import com.vanhack.api.repositories.ProductRepository;
import com.vanhack.api.services.ProductService;

public class ProductServicelmplementation implements ProductService {
	
	
	@Autowired
	ProductRepository productRepository;
	

	@Override
	public List<Product> listAll() {
		// TODO Auto-generated method stub
		return this.productRepository.findAll();
	}

	@Override
	public Product findByName(String name) {
		// TODO Auto-generated method stub
		return this.productRepository.findByName(name);
	}

	@Override
	public Product create(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product update(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(String name) {
		// TODO Auto-generated method stub
		
	}
	
	

}
