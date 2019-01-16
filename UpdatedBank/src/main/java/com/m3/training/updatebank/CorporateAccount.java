package com.m3.training.updatebank;

public class CorporateAccount extends Account implements IAccount {

	private String companyName;
	
	
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Override
	public BigDecimal getCurrentBalance() {
		return 0;
	}

	@Override
	public void setCurrentBalance(BigDecimal currentBalance) {
	}

	@Override
	public int getCustomerId() {
		return 0;
	}

	@Override
	public void setCustomerId(int customerId) {
		
	}

	@Override
	public int transactionMenu() {
		return 0;
	}


	@Override
	public String getClientInfo(int id) {
		String msg;
		msg = "Account Type: Corporate Account\n";
		msg += "Company Name: " + getCompanyName() + '\n';
		msg += super.getClientInfo(id);
		
		return msg;
	}

}
