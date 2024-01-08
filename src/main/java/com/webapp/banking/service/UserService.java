package com.webapp.banking.service;

import com.webapp.banking.entity.User;

public interface UserService {
	public User registerUser(User user);

	User getUserByAccountNumber(String account_no);

	public void saveUser(User user);

	User updateUser(User user);
}
