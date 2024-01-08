package com.webapp.banking.service;

import java.util.concurrent.CompletableFuture;

public interface EmailService {
	public CompletableFuture<Void> sendEmail(String to, String subject, String text);
    public String getOtpLoginEmailTemplate(String name,String accountNumber, String otp) ;
}