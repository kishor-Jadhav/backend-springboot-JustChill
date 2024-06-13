package com.justchill.example.config;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.justchill.example.Repository.UserDetailsRepo;

@Service
public class CustomUserDetails implements UserDetailsService {
    @Autowired
    UserDetailsRepo userDetailsRepo;
	@Override
	public UserDetails loadUserByUsername(String emialId) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		 
//		com.justchill.example.Entity.UserDetails user = userDetailsRepo.findByEmailId(emialId)
//			    .orElseThrow(() -> new RuntimeException("User Not Found"));
		com.justchill.example.Entity.UserDetails user = userDetailsRepo.findByEmailId(emialId);
			    
		if (user == null) {
            throw new UsernameNotFoundException("User not found");
        }
       // return new org.springframework.security.core.userdetails.User(user.getEmailId(), user.getPassword(), new ArrayList<>());
       return user;
	}

}
