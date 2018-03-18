package com.vanhack.api.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.vanhack.api.responses.Response;
import com.vanhack.api.entities.Order;
import com.vanhack.api.services.OrderService;

@RestController
@RequestMapping("/v1")
public class OrderController {
	
	@Autowired
	OrderService orderService;
	
	// Getting all the Orders
	@GetMapping("/orders")
	public ResponseEntity<List<Order>> getOrder() {
		return ResponseEntity.ok( this.orderService.listAll() );
		// Return ResponseEntity.ok( this.productService.listAll() );
	}
	
	// Cancel the order
	@DeleteMapping("/order/{order}")
	public ResponseEntity<String> Set(@PathVariable("order") Long id) {
		return ResponseEntity.ok( this.orderService.cancel(id) );
	}
	
	// Getting a order
	@GetMapping("/order/{order}")
	public ResponseEntity<Order> getOrder(@PathVariable("order") Long id) {
		return ResponseEntity.ok( this.orderService.findOrder(id) );
	}
	
	
	// Creating a Order
	@PostMapping("/order")
	public ResponseEntity<Response <Order>> getOrder(@Valid @RequestBody Order order, BindingResult result) {
		
		if (result.hasErrors()) {
			List<String> erros = new ArrayList<String>();
			result.getAllErrors().forEach(err -> erros.add(err.getDefaultMessage()));
			return ResponseEntity.badRequest().body( new Response<Order>(erros) );
		}
		
		return ResponseEntity.ok( new Response<Order> (this.orderService.createOrder(order) ) );
	}
	
	// Getting Order Status
	@GetMapping("/order/status/{order}")
	public ResponseEntity<String> getOrderStatus(@PathVariable("order") Long id) {
		return ResponseEntity.ok( this.orderService.findStatus(id) );
	}
	
	

	
}
