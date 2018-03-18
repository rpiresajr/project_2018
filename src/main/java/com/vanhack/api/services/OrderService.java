package com.vanhack.api.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vanhack.api.entities.Order;

@Service
public interface OrderService {
	
	Order findOrder(Long id);
	
	String findStatus(Long id);
	
	List<Order> listAll();
	
	Order createOrder(Order order);
	void cancel(Long id);

	
}
