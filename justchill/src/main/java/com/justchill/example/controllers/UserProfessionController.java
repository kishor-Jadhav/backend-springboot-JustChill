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
import com.justchill.example.services.UserProfessionService;

@RestController
@RequestMapping("/api/v1/") 
public class UserProfessionController {
@Autowired
UserProfessionService userProfessionService;

	@GetMapping("/userProfession")
	@ResponseBody
	public List<UserProfession> getAllUserProfession() {
		return this.userProfessionService.getAllUserProfession();
		
	}
	
	@PostMapping("/userProfessionadd")
	@ResponseBody
	public String addUserProfession(@RequestBody UserProfession userProfession) {
		userProfessionService.addUserProfession(userProfession);
	    return "User Profession added successfully!";
	}
	
	@GetMapping("/userProfession/{id}")
	@ResponseBody
	public UserProfession getUserProfession(@PathVariable Long id) {
	 
	    return  userProfessionService.findById(id);
	}

}
