package com.capgemini.retailermainteanancesystemapplication.service;

import java.util.List;

import com.capgemini.retailermainteanancesystemapplication.dto.Order;

public interface OrderService {
	public Order searchOrder(int orderId);
	public boolean addOrder(Order order);
	public List<Order> getAllOrder();

}
