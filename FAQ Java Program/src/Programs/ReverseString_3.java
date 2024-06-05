package Programs;

import java.util.Scanner;

public class ReverseString_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a Word:- " );
		String word = input.nextLine();
		StringBuffer revWord =new  StringBuffer(word);
		StringBuffer rev = revWord.reverse();
		System.out.println(rev);
	}
}
