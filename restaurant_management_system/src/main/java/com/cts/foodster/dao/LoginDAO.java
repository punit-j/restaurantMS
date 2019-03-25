package com.cts.foodster.dao;

import com.cts.foodster.bean.Login;

public interface LoginDAO {

	public Login Authenticate(Login login);
	public String registerAdmin(Login login);
	public Login getUser(String id); 
}
