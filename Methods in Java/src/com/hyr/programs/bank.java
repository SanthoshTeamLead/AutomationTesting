package com.hyr.programs;


public class bank {
	 static int  currentBalance = 550; 
	 
	 public static void greetMessage(){
		 System.out.println("Hello WellCome to Banking");
	 }
	 public void deposit(int Amount) {
		 currentBalance = currentBalance + Amount ;
		 System.out.println("Amount is Deposited Successfully");
	 }
	 public static void withdraw(int Amount) {
		 currentBalance = currentBalance - Amount ;
		 System.out.println("Amount is Withdrawal Sucessfully");
	 }
	 public  int getbal() {
		 return currentBalance ;
	 }
	 public static void main(String[] args) {
		greetMessage();
		bank bal = new bank();
		System.out.println("Current Balance ₹:"+bal.getbal());
		bal.deposit(25);
		System.out.println("After Deposit Balance ₹:"+bal.getbal());
		bal.withdraw(12);
		System.out.println("After Withdraw Balance ₹:"+bal.getbal());
	 }
}
