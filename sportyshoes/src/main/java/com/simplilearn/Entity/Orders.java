package com.simplilearn.Entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Orders {
	
	@Id
	@GeneratedValue
	private int orderid;
	private String name;
	private int shoeid ;
	private int categeory;
	private double price;
	private Date date;
	
	public Orders() {
	
		
	}
	public Orders(String name, int shoeid, int categeory, double price) {
		this.shoeid = shoeid;
		this.categeory = categeory;
		this.price = price;
		this.date = new Date();
		this.name = name;
		
	}
	
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getShoeid() {
		return shoeid;
	}
	public void setShoeid(int shoeid) {
		this.shoeid = shoeid;
	}
	public int getCategeory() {
		return categeory;
	}
	public void setCategeory(int categeory) {
		this.categeory = categeory;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	 

}
