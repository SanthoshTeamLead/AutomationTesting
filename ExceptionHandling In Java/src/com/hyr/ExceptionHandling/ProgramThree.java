package com.hyr.ExceptionHandling;

import java.util.Arrays;
import java.util.Scanner;

public class ProgramThree {
		public static void main(String[] args) {
			method2();
		}
		
		public static void method2() {
			method1();
		}
		
		public static void method1() {
			//	Scanner input = new Scanner(System.in);
			//	System.out.print("Enter Number a: ");
			//	int a = input.nextInt();
			//	System.out.print("Enter Number b: ");			
			//	int b = input.nextInt();
			//	int result = 0;
			try {
				//  throw new ArithmeticException("Please Enter Vaild Input In Given Data") ;
				  throw new IndexOutOfBoundsException("please Find the Particuler Value");
			}
			catch(ArithmeticException ae) {
				
				/*
				 * System.out.println("Please Enter Vaild Number b zero id divided by a");
				 * System.out.println(ae.getMessage());
				 * System.out.println(Arrays.toString(ae.getStackTrace()));
				 */
				System.out.println("Hellow world");
				throw ae;
			}
			catch(IndexOutOfBoundsException ae1) {
				System.out.println("Hellow world index ");
				System.out.println(Arrays.toString(ae1.getStackTrace()));
				System.out.println(ae1.getMessage());
				ae1.printStackTrace();
			}
			//System.out.println("Number b divided by times a :- "+result);
			
		}
}
