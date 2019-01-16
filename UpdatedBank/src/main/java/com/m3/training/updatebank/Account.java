package com.m3.training.updatebank;

import java.math.BigDecimal;
import java.util.Scanner;

public class Account implements IAccount {
	private BigDecimal currentBalance;
	private int customerId;
	Scanner reader = new Scanner(System.in);
	
	@Override
	public BigDecimal getCurrentBalance() {
		return currentBalance;
	}

	@Override
	public void setCurrentBalance(BigDecimal currentBalance) {
		this.currentBalance = currentBalance;
	}


	@Override
	public int getCustomerId() {
		return customerId;
	}


	@Override
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	
	public Account() {
		initiateTransaction();
		
	}
	

    public void initiateTransaction(){
            int userChoice = 0;
            userChoice = transactionMenu();
            do{

            switch(userChoice){
                case 1:
                    withdrawalTransaction();
                    break;
                case 2:
                    depositTransaction();
                    break;
                case 3:
                    System.out.println("Your total balance is " + getCurrentBalance());
                    break;
                default:
                    System.out.println("Invalid Selection");
                }
            userChoice = transactionMenu();
            }while(userChoice!= 0);
            System.out.println("Thank you for using Simple Bank(™)");
        }

    @Override
	public int transactionMenu(){
        int bankTransactionType;

        System.out.println("Welcome to Simple Bank(™)");
        System.out.println("Please input what kind of transation we"
                + " are doing today");
        System.out.println("1) Withdrawal");
        System.out.println("2) Deposits");
        System.out.println("3) Total Balance");
        System.out.println("0) To quit the program");
        bankTransactionType = reader.nextInt();
               
        return bankTransactionType;  
    }
    
    private void withdrawalTransaction(){
        String withdrawalAmount;
        System.out.println("Welcome to Simple Bank™");
        System.out.println("How much are you going to withdraw?");
        withdrawalAmount = reader.nextLine();
        if(withdrawalAmount <= getCurrentBalance()){
            setTotalBalance(getCurrentBalance() - withdrawalAmount);
            System.out.println("Thank you for withdrawing "+withdrawalAmount);
            //TO-DO receipts
            System.out.println("total Balance is now " +getCurrentBalance());
        }
        else{
              System.out.println("Insufficent Funds:");
              System.out.println("Total balance is " +getCurrentBalance());
    }
    }
    
    private void depositTransaction(){
        double depositAmount;
        System.out.println("Welcome to Simple Bank™");
        System.out.println("How much are you going to deposit?");
        depositAmount = reader.nextDouble();
        if(depositAmount <= 0){
            System.out.println("Invalid value");
            System.out.println("you cannot deposit " + depositAmount +" amount");          
        }
        else{
            setTotalBalance(getCurrentBalance() + depositAmount);
            System.out.println("You have successfully deposited "+depositAmount);
            System.out.println("Your Total Balance is now "+getCurrentBalance());
        }    
    }
    
	public String getClientInfo(int id) {
		this.customerId = id;
		String msg = "";
		msg += "CustomerID: " + getCustomerId() + ".\n";
		msg += "Current Balance: " + getCurrentBalance() + ".\n";
		return msg;		
	}
	
	
}
