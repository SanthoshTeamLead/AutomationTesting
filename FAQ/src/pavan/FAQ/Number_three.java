package pavan.FAQ;

import java.util.Scanner;

public class Number_three {
	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		System.out.print("Enter a Name:- ");
		String Name = userinput.nextLine();
		/***
		StringBuilder sb = new StringBuilder();
		sb.append(Name);
		sb.reverse();
		System.out.println(sb);
		*/
		
		StringBuffer sb2 = new StringBuffer(Name);
		sb2.reverse();
		System.out.println(sb2);
	}
}
