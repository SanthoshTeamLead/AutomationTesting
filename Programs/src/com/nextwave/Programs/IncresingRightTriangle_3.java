package com.nextwave.Programs;
import java.util.Scanner;

public class IncresingRightTriangle_3 {

	public static void main(String[] args) {
		System.out.print("Incresing RightTringle Enter No:- ");
		Scanner userinput = new Scanner(System.in);
		int N = userinput.nextInt();
		for(int i = 1; i<= N ; i++) {
			for(int j =i; j < N; j++) {
				System.out.print("  ");
			}
			for(int j= 1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
