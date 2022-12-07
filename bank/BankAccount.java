package com.xworkz.bankapp.bank;

public class BankAccount {
	
	String name;
	String ifscCode;
	String accountNo;
	public double balance;
	
	public double withDraw(double balance)
	{
	    System.out.println(" withDraw amount is " +  balance );
		this.balance=this.balance-balance;
		return this.balance;
	}
	
	
	public double deposit(double balance)
	{
		System.out.println("Amount deposited to friend  account " + balance);
		this.balance=this.balance+balance;
		return this.balance;
	}

	
	public void tranfer(double amount,BankAccount friendsAcccount)
	{
		System.out.println(" transation to friends account ");
		withDraw(amount);
		friendsAcccount.deposit(amount);
		System.out.println("tranction done");
	}
}
