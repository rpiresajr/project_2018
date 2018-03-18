package com.vanhack.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vanhack.api.entities.Product;
import com.vanhack.api.responses.Response;
import com.vanhack.api.services.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
   
	@GetMapping("/aqui")
	public String teste() {
		return "{ret=1}";
	}
	 
	@GetMapping
	public ResponseEntity<Response <List <Product>>> listAll(){
		
		return ResponseEntity.ok( new Response<List<Product>> ( this.productService.listAll() ) );
		//return null ;
	}

}





