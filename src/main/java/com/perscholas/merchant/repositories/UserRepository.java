package com.perscholas.merchant.repositories;

import com.perscholas.merchant.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
	
	User findByUsername(String username);
}
