package com.Nextwave.Programs;

import java.util.Scanner;

public class Stringrepetition$5 {

	public static void main(String[] args) {
		Scanner username = new Scanner(System.in);
		System.out.print("ENTER NAME:-");
		String word = username.nextLine();
		System.out.print("ENTER NO:-");
		int Digit = username.nextInt();
		
		int length = word.length()-3;
		System.out.println(word.substring(length).repeat(Digit));

	}

}
