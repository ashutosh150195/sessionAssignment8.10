package com.java.assignmenteight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BankAtm {
	
	public static String atmId = "SBI0XXX";
	public static String bankName = "SBI";
	public static String location = "MNO456";
	public static String balance = "8000";
	public static String amt ;
	public static BufferedReader br ;
	
	public BankAtm(){
		deposit(Double.parseDouble(amt));
		inputWithdrawAmount();
		withdraw(Double.parseDouble(amt));
	}
	private void inputWithdrawAmount() {
		// TODO Auto-generated method stub
		br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Enter withdraw amount : ");
			amt = br.readLine();
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		input();
		new BankAtm();
		input();
		new BankAtm();
		input();
		new BankAtm();
		
	}
	private static void input() {
		// TODO Auto-generated method stub
		br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Bank ATM : "+bankName);
		System.out.println("BankATM ID : "+atmId);
		System.out.println("Bank Location : "+location);
		try {
			System.out.println("Enter the amount to deposit : ");
			amt = br.readLine();
			System.out.println("Available amount before deposit : "+ Double.parseDouble(balance));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private static void deposit(double amt2){
		// TODO Auto-generated method stub
		Double d = (Double.parseDouble(balance)+ amt2);
		balance = d.toString();
		System.out.println("Available balance : "+balance);
	}
	private static void withdraw(double amt2) {
		// TODO Auto-generated method stub
		
		if (amt2 < (Double.parseDouble(balance))) {
			if((Double.parseDouble(balance)) <= 10000 || (Double.parseDouble(balance) - amt2) <= 10000){
				try {
					throw new BankATMException();
				} catch (BankATMException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
			}else{
				Double d = (Double.parseDouble(balance)- amt2);
				balance = d.toString();
				System.out.println("Balance after tranction :"+balance);
			}
		} else {
			System.out.println("The withdrawal should also not be allowed"
					+ " if the amount to be withdrawn is greater than balance.");
		}
	}

}
