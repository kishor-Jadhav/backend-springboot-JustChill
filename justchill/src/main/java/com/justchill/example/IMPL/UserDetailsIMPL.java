package com.justchill.example.IMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.justchill.example.Entity.UserDetails;
import com.justchill.example.Entity.UserProfession;
import com.justchill.example.Repository.UserDetailsRepo;
import com.justchill.example.services.UserDetailsService;
@Service
public class UserDetailsIMPL implements UserDetailsService{
    List <UserDetails> list;
    
    @Autowired
    UserDetailsRepo userDetailsRepo;
    
    @Autowired    
    private PasswordEncoder passwordEncoder;
    public UserDetailsIMPL(UserDetailsRepo userDetailsRepo) {
    	this.userDetailsRepo =userDetailsRepo;
    }
    
	@Override
	public List<UserDetails> getAllUserDetails() {
		// TODO Auto-generated method stub
		return userDetailsRepo.getAllUserDetails();
	}

	@Override
	public UserDetails findById(Long userId) {
		UserDetails UserDetailsDB = userDetailsRepo.findByUserId(userId);		 
		 return UserDetailsDB;
	}

	@Override
	public String addUserDetails(UserDetails userDetails) {
		// TODO Auto-generated method stub
		userDetails.setPassword(passwordEncoder.encode(userDetails.getPassword()));
		userDetailsRepo.save(userDetails);
		return "User Added sucessfully ";
	}
	

}
