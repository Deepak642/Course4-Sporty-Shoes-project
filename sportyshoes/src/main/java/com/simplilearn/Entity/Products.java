package com.simplilearn.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Products {
	
	@Id
	@GeneratedValue
	private int product_id;
	private int category;
	private String name;
	private int size;
	private double price;
	
	public Products() {
		
	}
	
	
	public Products(int category, String name, int size, double price) {
		super();
		this.category = category;
		this.name = name;
		this.size = size;
		this.price = price;
	}
	
	public int getProduct_id() {
		return product_id;
	}
	@Override
	public String toString() {
		return "Products [product_id=" + product_id + ", category=" + category + ", name=" + name + ", size=" + size
				+ ", price=" + price + "]";
	}


	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public int getCategory() {
		return category;
	}
	public void setCategory(int category) {
		this.category = category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
