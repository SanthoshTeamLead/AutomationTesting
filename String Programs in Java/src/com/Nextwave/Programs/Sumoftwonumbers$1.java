/*1.Write a program to print the sum of two integer inputs 
A and B ?.*/

package com.Nextwave.Programs;
import java.util.Scanner;

public class Sumoftwonumbers$1 {
	public static void main(String[] args) {
		Scanner name = new Scanner(System.in);
		System.out.print("Enter First No:- ");
		int DigitOne = name.nextInt();
		System.out.print("Enter Second No:- ");
		int DigitTwo = name.nextInt();
		int SumOfResults = DigitOne + DigitTwo;
		System.out.println("Final Results:- " +SumOfResults);
	}
}
