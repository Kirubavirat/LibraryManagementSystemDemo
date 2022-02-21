package com.example.demo.librarymanagementsystem.service;

import java.util.List;
import com.example.demo.librarymanagementsystem.entity.Orders;


public interface OrderService {
	 List<Orders> getAllOrders();
	 void saveOrders(Orders orders);
	 Orders getOrdersById(int id);
	 void deleteOrdersById(int id);
		
	

}
