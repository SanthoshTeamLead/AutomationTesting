package com.hyr.AbstractKeyword;

public class Axis extends Bank {
	@Override
	void withDraw() {
		System.out.println("Withdraw Limit is :- 15000");	
	}
	@Override
	void balEnquary() {
		// TODO Auto-generated method stub	
	}
	  void deposit(){ 
		  
		  super.deposit(); 
		  }
	public static void main(String[] args) {
		
		new Axis().deposit();
		new Axis().withDraw();
		new Axis().balEnquary();		
	}
}
