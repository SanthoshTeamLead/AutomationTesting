package com.nextwave.Programs;

import java.util.Scanner;

public class HollowRightAngle {

	public static void main(String[] args) {
		System.out.print("Enter No:- ");
		Scanner userinput = new Scanner(System.in);
		int N = userinput.nextInt();
		
		for(int i =1 ; i< N ; i++) {
			for(int j = i ; j > i; j++ ) {
				System.out.print("5");
				
			}
			/*
			 * for(int j ) {
			 * 
			 * }
			 */
		}

	}

}
