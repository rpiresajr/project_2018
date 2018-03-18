package com.vanhack.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vanhack.api.entities.Product;
import com.vanhack.api.services.ProductService;

@RestController
@RequestMapping("/v1/products")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
   
	@GetMapping("/aqui")
	public String teste() {
		return "{ret=1}";
	}
	 
	@GetMapping
	public ResponseEntity<List <Product>> listAll(){
		
		return ResponseEntity.ok( this.productService.listAll() );
		//return null ;
	}

}





