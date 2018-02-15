package com.java.consumer.service;

import com.java.consumer.helper.Response;
import com.java.consumer.model.User;

public interface BusinessFunctionService {
	
	public User getUserFromSecurityDemo();

	public String addUser(User user);

	public User findByUserId(Integer id);

	public User getUserByName(String name);

	public Response deleteById(Integer id);

}
