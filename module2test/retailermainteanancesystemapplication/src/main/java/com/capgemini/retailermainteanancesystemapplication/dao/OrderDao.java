package com.capgemini.retailermainteanancesystemapplication.dao;

import java.util.List;

import com.capgemini.retailermainteanancesystemapplication.dto.Order;

public interface OrderDao {
	public Order searchOrder(int orderId);
	public boolean addOrder(Order order);
	public List<Order> getAllOrder();

}
