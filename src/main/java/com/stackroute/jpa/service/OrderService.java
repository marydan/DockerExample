package com.stackroute.jpa.service;

import java.util.List;

import com.stackroute.jpa.model.Myorder;
 
public interface OrderService {

	public Myorder saveOrder(Myorder s);
	public List<Myorder> showOrders();
	public Myorder findOrder(String id);
	public List<Myorder> findCustomer(String name);
}
