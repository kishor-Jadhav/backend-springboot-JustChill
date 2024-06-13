package com.justchill.example.Entity;

 
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;

import jakarta.persistence.*;

@Entity
@Table(name = "user_details")
public class UserDetails implements org.springframework.security.core.userdetails.UserDetails{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "userId")
	private Long userId;
	
	@Column(name = "firstName", nullable = false, length = 50)
    private String firstName;
	
	@Column(name = "lastname", nullable = false, length = 50)
    private String lastname;
	
	@Column(name = "emailId", nullable = false, length = 50)
    private String emailId;
	
	@Column(name = "password", nullable = false, length = 50)
    private String password;
	
	@Column(name = "skills", nullable = false, length = 200)
    private String skills;
	
	@Column(name = "profession_id", nullable = false)
    private Integer profession_id;
    
	public UserDetails(Long userId, String firstName, String lastname, String emailId, String password,String skills, Integer profession_id) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastname = lastname;
		this.emailId = emailId;
		this.password = password;
		this.skills=skills;
		this.profession_id = profession_id;
	}
	public UserDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getUser_id() {
		return userId;
	}
	public void setUser_id(Long userId) {
		this.userId = userId;
	}
	public Long getProfession_id() {
		return userId;
	}
	public void setProfession_id(Integer profession_id) {
		this.profession_id = profession_id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserDetails [userId=" + userId + ", firstName=" + firstName + ", lastname=" + lastname + ", emailId="
				+ emailId + ", password=" + password + "]";
	}
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return this.emailId;
	}
    
}
