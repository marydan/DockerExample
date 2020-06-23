package com.stackroute.jpa.service;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import com.stackroute.jpa.model.Myorder;
import com.stackroute.jpa.repository.OrderRepo;

import junit.framework.Assert;

public class OrderServiceTest 
{
   @Mock
   OrderRepo repo;
   
   @InjectMocks
   OrderServiceImpl orderservice;
   
   Myorder myorder;
   
   @Before
   public void init() throws Exception
   {
	   MockitoAnnotations.initMocks(this);
	   myorder=new Myorder();
	   myorder.setOrderid("c567");
	   myorder.setCustomername("Raju");
	   
	   
   }
   
   @Test
   public void storerec()
   {
	   Mockito.when(orderservice.saveOrder(myorder)).thenReturn(myorder);
	   
	   Myorder result=orderservice.saveOrder(myorder);
	 //  Myorder obj=orderservice.findOrder("c567");
	   
	   Assert.assertEquals(result, myorder);
   }
   
}

