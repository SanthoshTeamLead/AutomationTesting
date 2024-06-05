package Programs;

import java.util.Scanner;

public class CountEvenOdd_7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a Number:- ");
		long Number = input.nextLong();
		String Snum = String.valueOf(Number);
		int len = Snum.length();
		int Even = 0; 
		int Odd = 0 ;
		for(int i =0 ; i < len ; i++) {
		int N = Character.getNumericValue(Snum.charAt(i));
		if(N%2 == 0) {
		   Even += 1;
		}
		else if(N%2 == 1){
		  Odd +=1 ;
		}
		}
		System.out.println("Even Number Count:- " + Even);
		System.out.println("Odd Number Count:- "+ Odd);
	}
}
