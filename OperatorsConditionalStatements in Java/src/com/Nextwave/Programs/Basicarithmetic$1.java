/*1.Write a program to take two integer inputs (say A and B) and print 
the result of the following operations: A+B, A-B, A*B */ 

package com.Nextwave.Programs;

import java.util.Scanner;

public class Basicarithmetic$1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter A No:-");
		int A = input.nextInt();
		System.out.print("Enter B No:-");
		int B = input.nextInt();
		int Addition = A + B;
		int Substract = A - B;
		int Multipication = A * B;
		System.out.println("A + B Value:- "+Addition);
		System.out.println("A - B Value:- "+Substract);
		System.out.println("A * B Value:- "+Multipication);

	}

}
