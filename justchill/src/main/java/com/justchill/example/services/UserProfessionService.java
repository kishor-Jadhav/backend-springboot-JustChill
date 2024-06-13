package com.justchill.example.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.justchill.example.Entity.UserDetails;
import com.justchill.example.Entity.UserProfession;

@Service
public interface UserProfessionService {
	public List<UserProfession> getAllUserProfession();
	UserProfession findById (Long profession_id);
	String addUserProfession(UserProfession profession_id);
}
