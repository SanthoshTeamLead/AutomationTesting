package pavan.FAQ;

import java.util.Scanner;

public class Number_Seven {
	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		System.out.print("Enter a Number:- ");
		int Number = userinput.nextInt();
		String strN = String.valueOf(Number);
		int len = strN.length();
		int EvenCount =0 ;
		int OddCount = 0;
		for(int i =0; i <len ; i++) {
			char w = strN.charAt(i);
			int N = Character.getNumericValue(w);
			if(N % 2 == 0) {
				EvenCount++;
			}
			else if(N % 2 == 1){
				OddCount++;
			}
		}
		System.out.println("EvenCount Numbers :- " + EvenCount);
		System.out.println("OddCount Numbers:- " + OddCount);
	}
}
