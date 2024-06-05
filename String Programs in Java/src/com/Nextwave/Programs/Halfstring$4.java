// 4. Write a program which prints the first half of the given input word.

package com.Nextwave.Programs;
import java.util.Scanner;

public class Halfstring$4 {

	public static void main(String[] args) {
		Scanner username = new Scanner(System.in);
		System.out.print("Enter Name:- ");
		String Word = username.nextLine();
		int len = Word.length();
		int Half = len / 2 ; 
		int i = 0 ;
		while(i <Half ) {
			System.out.print(Word.charAt(i));
			i++;
		}

	}

}
