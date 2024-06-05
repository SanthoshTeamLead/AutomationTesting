package InterviewPrograms;

import java.util.Scanner;

public class ReverseStringLogic {
	
	public static void main(String[] args) {
    Scanner userinput = new Scanner(System.in);
    System.out.print("Enter a Name:- ");
	String word = userinput.nextLine();
	int Count = word.length();
	String rev ="";
	for(int i=Count-1; i>=0 ; i--){
		rev += word.charAt(i);
	}
	System.out.println(rev);
	if(rev.equals(word)) {
		System.out.println("Palindrome Number");
	}else {
		System.out.println("Not Palindrome Number");
	}
}
}