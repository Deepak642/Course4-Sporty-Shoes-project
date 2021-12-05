package com.simplilearn.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.simplilearn.Entity.Products;
import com.simplilearn.Entity.Users;
import com.simplilearn.Entity.Orders;
import com.simplilearn.service.OrderService;
import com.simplilearn.service.ProductService;
import com.simplilearn.service.UserService;

@Controller

@RequestMapping("/Sportyshoes")
public class SportyShoesController {
	String username=null;
	
	@Autowired
	private ProductService shoeservice;
	@Autowired
	private OrderService orderservice;
	@Autowired
	private UserService userservice;
	
	
	@GetMapping("/")
	public String login()
	{
		return "login";
	}
	
	@GetMapping("/signup")
	public String signup()
	{
		return "signupform";
	}
	
	@GetMapping("/usersignup")
	public String userSignup(ModelMap model,@RequestParam String name,@RequestParam String email, @RequestParam String password)
	{
		userservice.insertUserDataService(name,email,password,2);
		
		return "login";
		
	}
	
	
	@GetMapping("/loginhandle")
	public String loginHandleCheck(ModelMap model,@RequestParam String email, @RequestParam String password)
	{
		System.out.println(email);
		System.out.println(password);
		Users user=userservice.isValidUser(email,password);
		if(user!=null) {
			username=user.getName();
			
			if(user.getRoleid()==1)
				return "admin";
			else
				return "user";
		}
		return "invalid";
	
   }
	
	@GetMapping("/AddShoes")
	public String addshoes()
	{
		
		return "addshoes";
	
   }
	
	@GetMapping("/addshoe")
	public String addshoe(@RequestParam int category,@RequestParam String name, @RequestParam int size,@RequestParam int price)
	{
		
		shoeservice.insertNewProductService(category,name,size,price);
		return "success";
	
   }
	
	@GetMapping("/ListUser")
	public String listUser(ModelMap model)
	{
		List<Users> user=userservice.getUserDataService();
		model.put("allusers", user);
		
		return "allusers";
		
	}
	
	
	
	
	@GetMapping("/ChangePassword")
	public String changepassword()
	{
		
		return "changepw";
		
	}
	
	@GetMapping("/logout")
	public String logout()
	{
		username=null;
		return "login";
		
	}
	@GetMapping("/password")
	public String password(@RequestParam String email, @RequestParam String curpassword, @RequestParam String newpassword)
	{
		
		Users user=userservice.isValidUser(email,curpassword);
		if(user!=null)
		{
			userservice.updatePassword(email,newpassword);
			return "success";
		}
		return "invalid";
		
	}
	
	
	@GetMapping("/menshoes")
	public String menShoesForm(ModelMap model) {
		System.out.println("men shoes");
		List<Products> mensData = shoeservice.getMensShoeData();
		model.put("menshoeData", mensData);
	
		
		return "mens";
	}

	
	@GetMapping("/womenshoes")
	public String womenMethod(ModelMap model) {
		List<Products> womensData = shoeservice.getWomensShoeData();
		model.put("womenshoeData", womensData);

		return "womens";
	}

	
	@GetMapping("/menshoespurchase")
	public String menShoePurchase(ModelMap model,@RequestParam int id, @RequestParam double price) {
		orderservice.insertOrder(username,id,1,price);
		return "success";
	}
	
	@GetMapping("/womenshoespurchase")
	public String womenShoePurchase(ModelMap model,@RequestParam int id, @RequestParam double price) {
		orderservice.insertOrder(username,id,2,price);
		return "success";
	}

	@GetMapping("/Orders")
	public String orders(ModelMap model) {
		List<Orders> menorders= orderservice.getFilteredOrders(1);
		model.put("menOrders", menorders);
		List<Orders> womenorders= orderservice.getFilteredOrders(2);
		model.put("womenOrders", womenorders);
		return "orderlist";
	}

}
