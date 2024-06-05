package pavan.FAQ;

import java.util.Scanner;

public class Counts_Of_Given_String {
	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		System.out.print("Enter String :- ");
		String Name = userinput.nextLine();
		int len = Name.length();
		int increDigit = 0;
		int increAlpha = 0;
		for(int i =0; i < len; i++) {
			char C = Name.charAt(i);
			if(Character.isDigit(C)) {
				increDigit++;
			}else if(Character.isAlphabetic(C)) {
				increAlpha++;
			}
		}
		System.out.println("Count of Digits in Given String :- " + increDigit);
		System.out.println("Count of Alphabets in Given String :- "+ increAlpha);
	}
}
