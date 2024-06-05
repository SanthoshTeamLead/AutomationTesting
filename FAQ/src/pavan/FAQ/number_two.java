package pavan.FAQ;

import java.util.Scanner;

public class number_two {
	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		System.out.print("Enter a Number:-  ");
		int Num = userinput.nextInt();
		String strNum = String.valueOf(Num);
		/**
		StringBuffer sb = new StringBuffer(strNum);
		StringBuffer rev = sb.reverse();
		System.out.println("Reverse Number:- " + rev);
		*/
		StringBuilder sb1 = new StringBuilder();
		sb1.append(strNum);
		sb1.reverse();
		System.out.println(sb1);
	}
}
