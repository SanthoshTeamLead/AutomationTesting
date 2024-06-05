/*2.Given a word W and an integer N, write a program to print 
  the character present at the index N in the word W.?*/

package com.Nextwave.Programs;
import java.util.Scanner;

public class Indexing$2 {
	public static void main(String[] args) {
		Scanner username = new Scanner(System.in);
		System.out.print("Enter Name:");
		String W = username.nextLine();
		System.out.print("Enter Index No:");
		int N = username.nextInt();
		
		int len = W.length();
		
		char[] A = new char[len];
		A[N] = W.charAt(N);
		System.out.println("U r Choose char:- "+A[N]);
		
		
	}

}
