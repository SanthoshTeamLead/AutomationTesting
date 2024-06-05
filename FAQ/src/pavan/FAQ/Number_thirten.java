package pavan.FAQ;

import java.util.Scanner;

public class Number_thirten {
	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		System.out.print("Enter a Number:- ");
		Long Number = userinput.nextLong();
		int Fact = 1;
		for(Long i =Number ; i >=1; i--) {
			Fact *= i;
		}
		System.out.println(Fact);
	}
}
