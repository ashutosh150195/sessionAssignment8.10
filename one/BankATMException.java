package com.java.assignmenteight;

@SuppressWarnings("serial")
public class BankATMException extends Exception {
	public BankATMException(){
		System.out.println("The balance is less than 10000 the withdrawal should not be allowed");
	}
	
	public String getMessage(){
		return "The balance is less than 10000 the withdrawal should not be allowed";
	}
}
