package com.stackroute.jpa.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import io.swagger.annotations.ApiModelProperty;

@Entity
 
public class Myorder {
	
	@Id
	String orderid;
	
	
	public String getOrderid() {
		return orderid;
	}
	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	
	@ApiModelProperty(notes="Customer Name , use String ",hidden=true)
	String customername;
	
	
	

}
