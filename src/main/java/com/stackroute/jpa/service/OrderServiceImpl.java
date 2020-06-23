package com.stackroute.jpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackroute.jpa.model.Myorder;
import com.stackroute.jpa.repository.OrderRepo;

@Service
public class OrderServiceImpl implements OrderService {
	
	
	@Autowired
	OrderRepo orderrepo;
	

	@Override
	public Myorder saveOrder(Myorder s) {
	 
		Myorder obj= orderrepo.save(s);
		
	//	orderrepo.del
		
		return obj;
	}

	@Override
	public List<Myorder> showOrders() {

    List<Myorder> orders=orderrepo.findAll();
    return orders;
	}

	@Override
	public Myorder findOrder(String id) {
		Optional<Myorder> myorder=orderrepo.findById(id);
		
		if(myorder.isPresent())
			return myorder.get();
		else
		return null;
	}

	@Override
	public List<Myorder> findCustomer(String name) {
		List<Myorder> orders=orderrepo.findByCustomername(name);
		return orders;
	}

}
