package com.simplilearn.service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.Entity.Orders;
import com.simplilearn.repository.OrderRepo;



@Service
public class OrderService {
	@Autowired
	private OrderRepo orderRepository;
	
	
	 public void insertOrder(String name,int shoeid,  int categeory,
			 double price)
	 {
		 Orders  order1 =new  Orders( name,shoeid, categeory, price);
		 orderRepository.save(order1);
	 }
	 
	

	 
	 public List<Orders> getFilteredOrders(int categeoryId)
	 {
	 List<Orders> orderedShoeList= (List<Orders>)orderRepository.getRequiredCompleteTransactionsData(categeoryId);
     
     return orderedShoeList;
	 
	 }

}

