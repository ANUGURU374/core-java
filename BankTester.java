package com.xworkz.bankapp;

import com.xworkz.bankapp.bank.BankAccount;

public class BankTester {
	public static void main(String args[])
	{
		
		BankAccount account=new BankAccount();
		account.deposit(5000);
		System.out.println("My account bal is" + account.balance);

			
		BankAccount friendsAccount=new BankAccount();
		friendsAccount.deposit(700);
		
		
		account.tranfer(500.00,friendsAccount);
		System.out.println("my account balance is"  + account.balance);
		
		System.out.println("my friend account balance is" +friendsAccount.balance);
		
		//double withDrawAmount=account.withDraw(400);
		//System.out.println(account + balance);
	     //account.withDraw(320.50)
		//System.out.println() ;
		
	}

}
