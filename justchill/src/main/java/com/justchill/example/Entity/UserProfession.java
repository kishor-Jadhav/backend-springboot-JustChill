package com.justchill.example.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_profession")
public class UserProfession {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "profession_id")
	private Long profession_id;
	
	@Column(name = "profession_name", nullable = false, length = 50)
    private String professionName;
	
	public UserProfession(Long profession_id, String professionName) {
		super();
		this.profession_id = profession_id;
		this.professionName = professionName;
	}
	public UserProfession() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "UserProfession [profession_id=" + profession_id + ", professionName=" + professionName + "]";
	}
	public Long getProfession_id() {
		return profession_id;
	}
	public void setProfession_id(Long profession_id) {
		this.profession_id = profession_id;
	}
	public String getProfessionName() {
		return professionName;
	}
	public void setProfessionName(String professionName) {
		this.professionName = professionName;
	}
	

}
