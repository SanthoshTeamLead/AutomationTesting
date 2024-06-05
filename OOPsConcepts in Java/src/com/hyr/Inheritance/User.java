package com.hyr.Inheritance;

public class User implements IAdmin  {

	public static void main(String[] args) {
		  Guest Gest = new Guest(); 
		  Gest.read();
		 
		  System.out.println();
		  
		  Developer dev = new Developer(); 
		  dev.read();
		  dev.write();
		  
		  System.out.println(); 
		  
		  Admin adim = new Admin(); 
		  adim.read();
		  adim.write();
		  adim.manage();   
	}

	@Override
	public void read() {
		// TODO Auto-generated method stub
		System.out.println("This is SANTHOSH AUTOMATION ENGINEER ");
		
	}

}
