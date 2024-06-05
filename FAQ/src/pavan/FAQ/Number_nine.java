package pavan.FAQ;

import java.util.Scanner;

public class Number_nine {
	public static void main(String[] args) {
		// Scanner userinput = new Scanner(System.in);
		int a = 20, b = 25, c =30;
		if((a > b)&&(a > c)){
			System.out.println("Bigest Number:- " + a);
		}else if((b > a) && (b > c)) {
			System.out.println("Bigest Number:-  " + b);
		}else if((c > a) && (c > b)) {
			System.out.println("Bigest Number:- " + c);
		}
	}
}
