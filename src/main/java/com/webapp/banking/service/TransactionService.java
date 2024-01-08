package com.webapp.banking.service;

import java.util.List;

import com.webapp.banking.dto.TransactionDTO;

public interface TransactionService {

	List<TransactionDTO> getAllTransactionsByAccountNumber(String accountNumber);

}
