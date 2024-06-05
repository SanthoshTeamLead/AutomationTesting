package pavan.FAQ;

import java.util.Scanner;

public class Special_Program_inJava {
	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		System.out.print("Enter Combination letters:- ");
		String Name = userinput.nextLine();
		int len = Name.length();
		String UpperLetters = "";
		String LowerLetters =" ";
		String Digits =" ";
		String SpecialCharacters =" ";
		
		for(int i = 0; i < len ; i++) {
			char C = Name.charAt(i);
			if(Character.isDigit(C)) {
				Digits += C;
			}else if(Character.isUpperCase(C)) {
				UpperLetters += C;
			}else if(Character.isLowerCase(C)) {
				LowerLetters += C;
			}else {
				SpecialCharacters += C;
			}
			}
		System.out.println("Upper Laters Only:- " + UpperLetters);
		System.out.println("Lower Laters Only:- " + LowerLetters);
		System.out.println("Digits Only:- " + Digits);
		System.out.println("Special Characters Only:- " + SpecialCharacters);
		}
	}

