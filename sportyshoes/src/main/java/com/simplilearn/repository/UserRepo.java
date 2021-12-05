package com.simplilearn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.simplilearn.Entity.Users;


@Repository
public interface UserRepo extends JpaRepository<Users, Integer> {
	
	
	 
	@Query("from Users where email=:email and password=:password")
    public Users  isValidUser(String email,String password );
	
	 
	
	 @Query("from Users where roleid=:rollid")
	    public Iterable<Users> getUserDatabyRoleid(int rollid);
	 
	  
	 
	 
  
	 @Modifying
	 @Transactional
	 @Query("update Users   set  password = :password where roleid=1 and email=:email")
	 public int updateAdminPassword(@Param("password") String password, @Param("email") String email);
	 
	 


}