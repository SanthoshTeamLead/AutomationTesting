package Programs;

import java.util.Scanner;

public class PalindromeInString_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a Word :- ");
		String word = input.nextLine();
		int len = word.length();
		String RevWord ="";
		for(int i = len-1 ; i >= 0 ; i--) {
			RevWord += word.charAt(i);
		}
		if(word.equalsIgnoreCase(RevWord)) {
			System.out.println("is a Palindrome Word");
		}else {
			System.out.println("is'nt a Palindrome Word");
		}
		
		
		}
	

}
