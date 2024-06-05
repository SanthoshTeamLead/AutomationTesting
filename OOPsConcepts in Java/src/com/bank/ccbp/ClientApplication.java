package com.bank.ccbp;

public class ClientApplication {

	public static void main(String[] args) {
		
		SavingsAccount saving = new SavingsAccount();
		System.out.println(saving.getEmail());
		saving.setEmail("Santhosh@gmail.com");
		System.out.println(saving.getEmail());
		
		// SavingsAccount  saving1 = new SavingsAccount();
		
		saving.setName("Santhosh Gorantala");
		System.out.println(saving.getName());
		
		saving.setAccNo(106900031487L);
		System.out.println(saving.getAccNo());
		
		
	}
}
