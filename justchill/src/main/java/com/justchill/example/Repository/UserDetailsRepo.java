package com.justchill.example.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

 
import com.justchill.example.Entity.UserDetails;

 

public interface UserDetailsRepo extends JpaRepository<UserDetails, Long>{
	 @Query("SELECT s FROM UserDetails s")
	 List<UserDetails> getAllUserDetails();
	 
	 @Query("SELECT c FROM UserDetails c ")
	 UserDetails findByUserId(Long userId);
	 
	// @Query("SELECT c FROM UserDetails c ")
	 UserDetails findByEmailId(String emailId);
	  
	 
	 UserDetails save(UserDetails userDetails);

}
