package com.m3.training.updatebank;

import java.math.BigDecimal;

public class PersonalAccount extends Account implements IAccount {
	
	private int personalId;
	private String firstName;
	private String lastName;
	private String address;
	private BigDecimal currentBalance;
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public BigDecimal getCurrentBalance() {
		return 0.0;
	}

	@Override
	public void setCurrentBalance(BigDecimal currentBalance) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getCustomerId() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setCustomerId(int customerId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int transactionMenu() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public String getClientInfo(int id) {
		String msg;
		msg = "Account Type: Personal Account\n";
		msg += "Account Name: " + getFirstName() + " " + getLastName() + "\n";
		msg += super.getClientInfo(id);
		return null;
	}

}
