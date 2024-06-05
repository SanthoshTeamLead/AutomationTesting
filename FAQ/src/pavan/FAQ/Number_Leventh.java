package pavan.FAQ;

import java.util.Scanner;

// Natural numbe > 1;
// Only Divisible 1 and Itself 

public class Number_Leventh {
	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		System.out.println("Enter a number:- ");
		int Number = userinput.nextInt();
		int Count= 0;
		if(Number > 1) {
		for(int i = 1; i<=Number ;i++) {
			if(Number%i == 0) {
				Count++;
			}
		}
		if(Count == 2) {
			System.out.println("Given Number is PrimeNumber");
		}else {
			System.out.println("not prime Number");
		}
		}else {
			System.out.println("not prime Number");
		}
	}
}
