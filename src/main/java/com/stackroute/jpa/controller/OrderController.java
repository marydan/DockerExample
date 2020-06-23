package com.stackroute.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.jpa.model.Myorder;
import com.stackroute.jpa.service.OrderService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;


@RestController
@RequestMapping("order")
public class OrderController {
	
	@Autowired
	OrderService orderserve;

@ApiOperation(value="This is to store the order")	
 @PostMapping("/saveOrder")
 public ResponseEntity addrec(@RequestBody Myorder order)
 {
	 Myorder orderresult=orderserve.saveOrder(order);
	 return new ResponseEntity<Myorder>(orderresult,HttpStatus.OK);
 }

@ApiOperation(value="Used to retrive all orders",response=Iterable.class)
@ApiResponses(
		value={	
	@ApiResponse(code=200,message="Successfully  retreived all records"),
	@ApiResponse(code=404, message="No orders stored so far")
	} )

 @GetMapping("/showorder")	
 public ResponseEntity showOrder()
 {
	 List<Myorder> orders=orderserve.showOrders();
	 
	 return new ResponseEntity<List<Myorder>>(orders,HttpStatus.OK);
 } 
 
 @ApiOperation(value="List the details of given customer")
 @GetMapping("/showcustomer/{custname}")
 public ResponseEntity showCustomer(@PathVariable("custname") String name)
 {
	 List<Myorder> orders=orderserve.findCustomer(name);
	 return new ResponseEntity<List<Myorder>>(orders,HttpStatus.OK);
 }
}
