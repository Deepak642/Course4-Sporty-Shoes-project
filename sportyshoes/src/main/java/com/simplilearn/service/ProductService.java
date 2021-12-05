package com.simplilearn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.Entity.Products;
import com.simplilearn.repository.ProductRepo;




 

@Service
public class ProductService {
	
	@Autowired
	private ProductRepo  shoesDao;
	
	
	
	 public List<Products> getMensShoeData() {
		 
		 List<Products> mensData= (List<Products>)shoesDao.findByCategory(1);
	       System.out.println(mensData);
	       return mensData;
	    }
	 
 public List<Products> getWomensShoeData() {
		 
		 List<Products> womensData= (List<Products>)shoesDao.findByCategory(2);
	       System.out.println(womensData);
	       return womensData;
	    }


 
 

 
 public void insertNewProductService(int categeory,String name, int size,double price )
 {
		
			
		
			Products s=new Products(categeory,name, size, price);
			shoesDao.save(s);
 	      
           
		
     }
 
 
 
}
