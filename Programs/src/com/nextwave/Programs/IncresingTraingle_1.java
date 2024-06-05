package com.nextwave.Programs;
import java.util.Scanner;
public class IncresingTraingle_1 {

	public static void main(String[] args) {
		System.out.print("Incresing Triangle Enter No:- ");
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		int N = userInput.nextInt();
		for(int i= 1; i<=N; i++) {
			for(int j =1 ; j <=i ; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

}
