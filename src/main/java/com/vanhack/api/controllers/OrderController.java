package com.vanhack.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vanhack.api.entities.Order;
import com.vanhack.api.services.OrderService;

@RestController
@RequestMapping("/v1")
public class OrderController {
	
	@Autowired
	OrderService orderService;
	
	@GetMapping("/orders")
	public ResponseEntity<List<Order>> getOrder() {
		return ResponseEntity.ok( this.orderService.listAll() );
		// eturn ResponseEntity.ok( this.productService.listAll() );
	}
	
	@GetMapping("/order/{order}")
	public ResponseEntity<Order> getOrder(@PathVariable("order") Long id) {
		return ResponseEntity.ok( this.orderService.findOrder(id) );
	}
	
	@PostMapping("/order")
	public ResponseEntity<Order> getOrder(@RequestBody Order order) {
		return ResponseEntity.ok( this.orderService.createOrder(order) );
	}
	

	
}
