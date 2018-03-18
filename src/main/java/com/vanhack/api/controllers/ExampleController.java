package com.vanhack.api.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teste/hello")
public class ExampleController {
	
	@GetMapping("/{name}")
	@PreAuthorize("hasAnyRole('USUARIDO','ADMIN')")
	public String hello(@PathVariable("name") String name) {
		return "Hi "+name;
	}

}
