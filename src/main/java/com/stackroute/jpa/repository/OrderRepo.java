package com.stackroute.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.stackroute.jpa.model.Myorder;

 
@Repository
public interface OrderRepo extends JpaRepository<Myorder,String> 
{
  public List<Myorder> findByCustomername(String name);
  
  public Myorder findByOrderidAndCustomername(String orderid,String cname);
}
