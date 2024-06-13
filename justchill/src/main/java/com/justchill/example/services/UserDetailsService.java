package com.justchill.example.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.justchill.example.Entity.UserDetails;

 
@Service
public interface UserDetailsService {
	public List<UserDetails> getAllUserDetails();
	UserDetails findById (Long user_id);
	String addUserDetails(UserDetails user_id);
}
