package com.hyr.AbstractKeyword;

abstract class SBI extends Bank{

	@Override
	void withDraw() {
		System.out.println("Withdraw Limit is :- 20000");
	}
	@Override
	void deposit() {
		System.out.println("Deposit :2024");
		super.deposit();
		 }
	
}