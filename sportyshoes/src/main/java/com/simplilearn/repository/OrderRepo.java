package com.simplilearn.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.simplilearn.Entity.Orders;

@Repository
public interface OrderRepo  extends   JpaRepository<Orders, Integer>{
	
 
	 @Query("from Orders where categeory=:categeoryId order by date")
	 public List<Orders> getRequiredCompleteTransactionsData(int categeoryId);

}