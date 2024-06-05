package Programs;

import java.util.Scanner;

public class RemoveWhiteSpaceString_25 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a Word:- ");
		String word = input.nextLine();
		String remspace = word.trim();
		if(word.equals(remspace)) {
			System.out.println("In Given Word No Spaces");
		}else {
			System.out.println("Remove Spaces in Given Word:-" + remspace);
		}
	}
}
