package com.justchill.example.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.justchill.example.Entity.UserProfession;

 

public interface UserProfessionRepo extends JpaRepository<UserProfession, Long> {
	 @Query("SELECT s FROM UserProfession s")
	 List<UserProfession> getAllUserProfession();
	 
	 @Query("SELECT c FROM UserProfession c WHERE c.profession_id = ?1")
	 UserProfession findByprofession_id(Long profession_id);
	 
	 UserProfession save(UserProfession userProfession);
}
