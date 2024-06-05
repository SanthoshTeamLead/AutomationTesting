package pavan.FAQ;

import java.util.Scanner;

public class Number_six {
		public static void main(String[] args) {
			Scanner userinput = new Scanner(System.in);
			System.out.print("Enter a Number:- ");
			long Number = userinput.nextLong();
			String str = String.valueOf(Number);
			
			int count =0;
			for(int i =0; i<str.length(); i++) {
				count++;
			}
			System.out.println("Count of Numbers:-" + count);
		}
}
