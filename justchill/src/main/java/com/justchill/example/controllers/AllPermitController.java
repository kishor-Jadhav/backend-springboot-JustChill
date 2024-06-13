package com.justchill.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.justchill.example.Entity.UserDetails;
import com.justchill.example.services.UserDetailsService;

@RestController
@RequestMapping("/authpermit/v1/") 
public class AllPermitController {
	@Autowired
	UserDetailsService userDetailsService;
	
	 @PostMapping("/registration")
	    @ResponseBody
	    public String addUser(@RequestBody UserDetails userDetails) {
		 userDetailsService.addUserDetails(userDetails);
	        return "User added successfully!";
	    }
}
