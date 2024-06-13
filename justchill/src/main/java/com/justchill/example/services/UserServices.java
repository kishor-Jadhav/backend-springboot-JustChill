package com.justchill.example.services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.justchill.example.models.UsersModel;
@Service
public class UserServices {
private List<UsersModel> store= new ArrayList<>();

public UserServices() {
	store.add(new UsersModel(UUID.randomUUID().toString(),"KISHOR","kishor01jadhav@gmail.com"));
	store.add(new UsersModel(UUID.randomUUID().toString(),"Ram","R@gmail.com"));
	store.add(new UsersModel(UUID.randomUUID().toString(),"Mohan","M@gmail.com"));
}
public  List<UsersModel>  getUserList(){
	return this.store;
}
}
