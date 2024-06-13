package com.justchill.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

 
import com.justchill.example.Entity.UserDetails;
import com.justchill.example.Entity.UserProfession;
import com.justchill.example.services.UserDetailsService;
import com.justchill.example.services.UserProfessionService;

@RestController
@RequestMapping("/api/v1/") 
public class UserDetailsController {
	@Autowired
	UserDetailsService userDetailsService;
	
	  
	
	 @GetMapping("/userslist")
	    @ResponseBody
		public List<UserDetails> getAllCourse() {
			return this.userDetailsService.getAllUserDetails();
			
		}
	 
	 @PostMapping("/usersadd")
	    @ResponseBody
	    public String addUser(@RequestBody UserDetails userDetails) {
		 userDetailsService.addUserDetails(userDetails);
	        return "User added successfully!";
	    }
	 
	 @GetMapping("/users/{id}")
	  @ResponseBody
	    public UserDetails getUser(@PathVariable Long id) {
		 
	        return  userDetailsService.findById(id);
	    }
	

}
