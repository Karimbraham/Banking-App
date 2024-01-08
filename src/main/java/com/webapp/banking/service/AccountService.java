package com.webapp.banking.service;

import com.webapp.banking.entity.Account;
import com.webapp.banking.entity.User;

public interface AccountService {

	public Account createAccount(User user);
	public boolean isPinCreated(String accountNumber) ;
	public void createPIN(String accountNumber, String password, String pin) ;
	public void updatePIN(String accountNumber, String oldPIN, String password, String newPIN);
	public void cashDeposit(String accountNumber, String pin, double amount);
	public void cashWithdrawal(String accountNumber, String pin, double amount);
	public void fundTransfer(String sourceAccountNumber, String targetAccountNumber, String pin, double amount);
	
	
}
