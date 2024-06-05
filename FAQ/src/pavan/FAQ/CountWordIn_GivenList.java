package pavan.FAQ;

import java.util.Scanner;

public class CountWordIn_GivenList {
	public static void main(String[] args){
		//String word= "Hi This is Santosh";
		Scanner userinput = new Scanner(System.in);
		System.out.print("Enter a Some Sentence:-  ");
		String word = userinput.nextLine();
		String[] Count = word.split(" ");
		for(String i : Count) {
			System.out.println(i);
		}
		System.out.println("Count Of Words:- " + Count.length);
	}
}
