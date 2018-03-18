package com.vanhack.api.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ExampleController {

	@GetMapping()
	public ResponseEntity<String> basePath(){
		return ResponseEntity.ok("Please the root directory is \n\t/v1");
	}

	@GetMapping("/v1")
	public ResponseEntity<String> basePath2(){
		return ResponseEntity.ok("Following the paths:\n\t/v1/products \n\t/v1/orders \n\t/v1/order \n\nFor more information please access : https://github.com/rpiresajr/project_2018");
	}


}
