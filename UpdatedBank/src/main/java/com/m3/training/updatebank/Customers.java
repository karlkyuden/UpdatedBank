package com.m3.training.updatebank;

import java.util.ArrayList;
import java.util.List;

public class Customers {
	
	List<IAccount> accountList = new ArrayList<IAccount>();
	
	
	
	public Customers() {
		
		
	}
	
	public void createNewClient() {
		int accountType;
		IAccount pa = new PersonalAccount();
		IAccount ca = new CorporateAccount();
		switch(accountType = getTypeAccount()) {
		case 1:
			accountList.add(pa.createClientInfo(accountList.size()));
			break;
		case 2:
			accountList.add(ca.createClientInfo(accountList.size()));
			break;

		}
	}
	
	private int getTypeAccount() {
		int accountType;
		
		
	}
	
	public String getClientList() {
		String msg ="";
		for(int current = 0; current <= accountList.size(); current++) {
			msg +=accountList.get(current).getClientInfo(current) +'\n';	
		}
		return msg;
		
	}
	
}
