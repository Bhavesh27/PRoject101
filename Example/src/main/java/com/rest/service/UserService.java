package com.rest.service;

import java.util.List;

import com.rest.model.Library;
import com.rest.model.User;

public interface UserService {

//    User create(User user);
//
//    User delete(int id);
//
//    List<User> findAll();
//
//    User findById(int id);
//
//    User update(User user);
	
	public void addUser(User user);
	public void deleteUser(long id);
	public List<User> getAllUser();
	public void updateUser(User user);
}
