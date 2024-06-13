package com.justchill.example.controllers;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.justchill.example.models.UsersModel;
import com.justchill.example.services.UserServices;

 

@RestController
@RequestMapping("/home/") 
public class HomeController {
	@Autowired
	private UserServices userService;
	
	 @GetMapping("/wel")
	    @ResponseBody
		public String home() {
			return "welcome to JustChill";
			
		}
	 
	 @GetMapping("/user")
	    @ResponseBody
		public  List<UsersModel> getUser() {
			return userService.getUserList();
			
		}
	 
	 @GetMapping("/currentuser")
	    @ResponseBody
		public  String getCurrentLogger(Principal principal) {
			return principal.getName();
			
		}
}
