package pavan.FAQ;

import java.util.Scanner;

public class Separation_in_Given_String {
	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		System.out.print("Enter a Given String:- ");
		String Name = userinput.nextLine();
		int len = Name.length();
		String alphabets = " ";
		String Numbers =" ";
		for(int i = 0; i < len ; i++){
			char C = Name.charAt(i);
			if(Character.isDigit(C)){
				Numbers = Numbers + C;
			}else if(Character.isAlphabetic(C)){
				alphabets = alphabets + C ;
			}
		}
		System.out.println("Digits Separation:- " + Numbers);
		System.out.println("Alphabets Separation:- " + alphabets);
		
	}
}
