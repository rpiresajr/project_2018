package com.vanhack.api.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vanhack.api.entities.Product;
import com.vanhack.api.repositories.ProductRepository;
import com.vanhack.api.services.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	
	
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
