package pavan.FAQ;

import java.util.Scanner;

public class Number_five {
	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		System.out.print("Enter A Name :- ");
		String Name = userinput.nextLine();
		
		StringBuffer sb = new StringBuffer(Name);
		StringBuffer rev = sb.reverse();
		String afterRev = String.valueOf(rev);
		if(Name.equals(afterRev)) {
			System.out.println("String is Palindrome");
		}
		else {
			System.out.println("String is Not Palindrome");
		}
	}
}
