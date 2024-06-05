package pavan.FAQ;

import java.util.Scanner;

public class Number_four {
	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		System.out.print("Enter a Number :- ");
		int value = userinput.nextInt();
		String strvalue = String.valueOf(value);
		
		StringBuffer sb = new StringBuffer(strvalue);
		sb.reverse();
		String str = String.valueOf(sb);
		System.out.println("Reverse Number:- "+sb);
		if(strvalue.equals(str)){
			System.out.println("Palindrome Number ");
		}else {
			System.out.println("Not Palindrome Number");
		}		
		
	}
}
