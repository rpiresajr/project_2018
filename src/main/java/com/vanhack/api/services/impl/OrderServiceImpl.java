package com.vanhack.api.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vanhack.api.entities.Order;
import com.vanhack.api.repositories.OrderRepository;
import com.vanhack.api.services.OrderService;

@Service
public class OrderServiceImpl implements OrderService{

	@Autowired
	OrderRepository orderRepository;

	@Override
	public String findStatus(Long id) {
		// TODO Auto-generated method stub
		
		return this.orderRepository.findOne(id).getStatus();
	}
	
	@Override
	public List<Order> listAll(){
		return this.orderRepository.findAll();
	}
	
	@Override
	public Order findOrder(Long id) {
		// TODO Auto-generated method stub
		
		return this.orderRepository.findOne(id);
	}

	
	@Override
	public Order createOrder(Order order) {
		// TODO Auto-generated method stub
		this.orderRepository.save(order);
		return order;
	}

	@Override
	public String cancel(Long id) {
		// TODO Auto-generated method stub
		Order order = this.orderRepository.findOne(id);
		order.setStatus("Canceled");
		this.orderRepository.save(order);
		return "Order Canceled \n" +order.toString() ; 
	}

}
