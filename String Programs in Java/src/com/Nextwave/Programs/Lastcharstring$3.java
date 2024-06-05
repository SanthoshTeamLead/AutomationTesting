 // 3.Write a program which prints the last character of a given word.

package com.Nextwave.Programs;
import java.util.Scanner;

public class Lastcharstring$3 {
	public static void main(String[] args) {
		Scanner Name = new Scanner(System.in);
		System.out.print("Enter Name:- ");
		String Word = Name.nextLine();
		int length = Word.length();
		
		char[] Array = new char[length];
		Array[length-1] = Word.charAt(length-1);
		System.out.println("Last char:-"+ Array[length-1]);
	
	}
}
