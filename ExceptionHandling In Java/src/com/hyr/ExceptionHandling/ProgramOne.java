package com.hyr.ExceptionHandling;

import java.util.Arrays;

/*Exception Here What is Meaning Of Each Line */
	/*Program Execution Started
	  Exception in thread "main" java.lang.ArithmeticException: / by zero
	  at com.hyr.ExceptionHandling.Program.main(Program.java:10)           */
	
	//Stack trace  
	/*
	 * Exception Name : java.lang.ArithmeticException
	 * Exception Message : / by zero getMessage()
	 * Which Line Number : Program.java:23 
	 * Method Info  :
	 */
public class ProgramOne {
	
	public static void main(String[] args) {
		method2();	
	}
	public static void method2() {
		method1();
	}
	
	
	public static void method1() {
		System.out.println("Program Excution Started");
		int fNumber = 9;
		int sNumber = 0;
		int result = 0;
		
		try {
			result = fNumber / sNumber;
		}
		catch(ArithmeticException AE) {
			System.out.println(AE.toString());
			// System.out.println(AE.toString()); // Write a Logic to Enter this message into Log Files
			 System.out.println(Arrays.toString(AE.getStackTrace()));
			 AE.printStackTrace();
			// throw AE ;
		}
		finally {
			System.out.println("Finally Block");
		}

	//	System.out.println("OutPut is :-  " + result);
	//	System.out.println("Program Excution End");	
	}

}

//try {
//result = fNumber/sNumber; // Exception facing issue include try block
//
//}
//catch(ArithmeticException Ae){
//System.out.println(Ae.toString());
//System.out.println(Ae.getMessage());
////	System.out.println(Ae.);
//}
