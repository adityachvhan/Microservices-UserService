package com.corejavahub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.corejavahub.model.User;

public interface UserRepository extends JpaRepository<User, String> {

	
}
