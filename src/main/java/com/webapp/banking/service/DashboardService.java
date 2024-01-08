package com.webapp.banking.service;

import com.webapp.banking.dto.AccountResponse;
import com.webapp.banking.dto.UserResponse;

public interface DashboardService {
    UserResponse getUserDetails(String accountNumber);
    AccountResponse getAccountDetails(String accountNumber);
}