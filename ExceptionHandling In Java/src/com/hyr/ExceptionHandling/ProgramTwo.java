package com.hyr.ExceptionHandling;

public class ProgramTwo {

	public static void main(String[] args) {
		int i = 5; 
		int j = 0;
		int result = 0;
		
		try {
			 result = i / j ;
		}
		catch(ArithmeticException  ae) {
			System.out.println("Zero can't divided by any value ");
			throw ae;
		}
		System.out.println("Hello World ");
		System.out.println(result);
	}

}
