package Programs;

import java.util.Scanner;

public class CountOfDigitsInNumber_6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a Number:- ");
		long Number = input.nextLong();
		String conString = String.valueOf(Number);
		int len = conString.length();
		System.out.println(len);
		
		int count = 0;
		for(int i = 0; i <len; i++) {
			count += 1;
		}
		System.out.println("Count of Digits:- "+count);
	}
}
