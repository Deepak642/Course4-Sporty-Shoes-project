package com.simplilearn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;


import com.simplilearn.Entity.Products;

public interface ProductRepo extends   JpaRepository<Products, Integer>{
	@Query("from Products where category=:category")
     public Iterable<Products> findByCategory(int category);
  
 

  
  
    
	 
  
   
  

}
