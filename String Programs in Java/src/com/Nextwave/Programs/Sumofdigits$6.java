// 6.Write a program to read a single line of input, which is a three-digit
// number,and print the sum of the three digits in the given number.

package com.Nextwave.Programs;
import java.util.Scanner;
public class Sumofdigits$6 {

	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		System.out.print("Enter Number:-");
		String digit = sc.nextLine();
		
		int a =Integer.parseInt(String.valueOf(digit.charAt(0))) ;
		int b =Integer.parseInt(String.valueOf(digit.charAt(1)));
		int c =Integer.parseInt(String.valueOf(digit.charAt(2)));
		
		System.out.println("Sum of Digits:-"+  (a + b+ c));

	}

}
