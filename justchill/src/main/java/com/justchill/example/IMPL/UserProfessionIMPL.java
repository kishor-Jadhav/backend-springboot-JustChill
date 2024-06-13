package com.justchill.example.IMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.justchill.example.Entity.UserProfession;
import com.justchill.example.Repository.UserProfessionRepo;
import com.justchill.example.services.UserProfessionService;
@Service
public class UserProfessionIMPL implements UserProfessionService {
	List<UserProfession> list;
	
	@Autowired
	UserProfessionRepo userProfessionRepo;
	public UserProfessionIMPL(UserProfessionRepo userProfessionRepo) {
		this.userProfessionRepo=userProfessionRepo;
	}
	@Override
	public List<UserProfession> getAllUserProfession() {
		return userProfessionRepo.getAllUserProfession();
		 
	}

	@Override
	public UserProfession findById(Long profession_id) {
		// TODO Auto-generated method stub
		 UserProfession UserProfessionDB = userProfessionRepo.findByprofession_id(profession_id);		 
		 return UserProfessionDB;
	}

	@Override
	public String addUserProfession(UserProfession userProfession) {
		userProfessionRepo.save(userProfession);
        return "Add Record";
	}

}
