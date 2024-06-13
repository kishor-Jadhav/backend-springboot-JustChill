package com.justchill.example.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

 
public class UsersModel {
 private String UserId;
 private String UserName;
 private String UserEmail;
public UsersModel(String userId, String userName, String userEmail) {
	 
	UserId = userId;
	UserName = userName;
	UserEmail = userEmail;
}
public UsersModel() {
	super();
	// TODO Auto-generated constructor stub
}
public String getUserId() {
	return UserId;
}
public void setUserId(String userId) {
	UserId = userId;
}
public String getUserName() {
	return UserName;
}
public void setUserName(String userName) {
	UserName = userName;
}
public String getUserEmail() {
	return UserEmail;
}
public void setUserEmail(String userEmail) {
	UserEmail = userEmail;
}
@Override
public String toString() {
	return "UsersModel [UserId=" + UserId + ", UserName=" + UserName + ", UserEmail=" + UserEmail + "]";
}

 
}
