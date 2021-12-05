package com.simplilearn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.Entity.Users;
import com.simplilearn.repository.UserRepo;



@Service
public class UserService {

	@Autowired
	private UserRepo userDao;

	public Users isValidUser(String email, String password) {

		Users user = userDao.isValidUser(email, password);
	    return user;
	}
	
	public List<Users> getUserDataService() {
		
		 List<Users> usersList= (List<Users>)userDao.getUserDatabyRoleid(2);
	        
	       return usersList;
	    }
	
	
	
	
	
 	
	public  void  updatePassword(String email,String password) {
		
		    userDao.updateAdminPassword(password,email);
		     
	       
	    }
	
	public void insertUserDataService(String name,String email, String password, int rollid )
	{
		Users   u =new Users(name, email ,password, rollid);
		userDao.save(u);
	}
}

