package com.m3.training.updatebank;

import java.math.BigDecimal;

public interface IAccount {

	BigDecimal getCurrentBalance();

	void setCurrentBalance(BigDecimal currentBalance);

	int getCustomerId();

	void setCustomerId(int customerId);

	int transactionMenu();
	
	public String getClientInfo(int id);

}