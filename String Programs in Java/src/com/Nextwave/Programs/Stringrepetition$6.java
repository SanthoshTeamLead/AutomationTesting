package com.Nextwave.Programs;
import java.util.Scanner;
public class Stringrepetition$6 {
	public static void main(String[] args) {
		Scanner name = new Scanner(System.in);
		System.out.print("Enter String:-");
		String word = name.nextLine();
		System.out.print("Enter No Of Digits:-");
		int Digit = name.nextInt();
		String Result = (word + " ").repeat(Digit);
		System.out.println(Result);
	}
}
