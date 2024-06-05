package com.hyr.encapsulation;

public class User {

	public static void main(String[] args) {
		
		Bank u = new Bank();
		u.setName("Santhosh Gorantala");
		System.out.println(u.getName());
		
		u.setAccountNo(1016100031487L);
		System.out.println(u.getAccountNo());
	}

}
