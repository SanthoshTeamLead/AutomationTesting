package Programs;

import java.util.Scanner;

public class PalindromeNumber_4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a Number :- ");
		int Num = input.nextInt();
		String revNum =  String.valueOf(Num);
		StringBuilder sb = new StringBuilder(revNum);
		StringBuilder revWord = sb.reverse();
		System.out.println(revWord);
		if(revNum.contentEquals(revWord)) {
			System.out.println("is a Palindrome Number");
		}else {
			System.out.println("is't palindrome Number");
		}
		
		
	}

}
