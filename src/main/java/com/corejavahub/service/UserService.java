package com.corejavahub.service;

import java.util.List;

import com.corejavahub.model.User;

public interface UserService {

	User saveUser(User user);

	List<User> getAllUser();

	User getUser(String userId);

//	void deleteUser(String userId); 
//
//	User updateUser(String userId, User user); 
}
