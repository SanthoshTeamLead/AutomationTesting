package pavan.FAQ;

import java.util.Scanner;

public class Number_Eight {
	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		System.out.print("Enter a Number:- ");
		int Number = userinput.nextInt();
		String strNum = String.valueOf(Number);
		int len = strNum.length();
		int sum = 0;
		for(int i=0; i < len ; i++) {
			char C = strNum.charAt(i);
			int N = Character.getNumericValue(C);
			sum += N;
		}
		System.out.println(sum);
	}
}
