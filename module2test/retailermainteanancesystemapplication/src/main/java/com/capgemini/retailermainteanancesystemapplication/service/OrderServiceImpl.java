package com.capgemini.retailermainteanancesystemapplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.retailermainteanancesystemapplication.dao.OrderDao;
import com.capgemini.retailermainteanancesystemapplication.dto.Order;
@Service
public class OrderServiceImpl implements OrderDao{
	@Autowired
	private OrderDao dao;

	@Override
	public Order searchOrder(int orderId) {
		return dao.searchOrder(orderId);
	}

	@Override
	public boolean addOrder(Order order) {
		return dao.addOrder(order);
	}

	@Override
	public List<Order> getAllOrder() {
		return dao.getAllOrder();
	}

}
