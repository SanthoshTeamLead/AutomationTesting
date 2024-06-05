package com.nextwave.Programs;
import java.util.Scanner;

public class Squares_2 {

	public static void main(String[] args) {
		System.out.print("Squares Enter No:- ");
		Scanner userinput = new Scanner(System.in);
		int N = userinput.nextInt();
		for(int i = 1; i<=N; i++) {
			for(int j = 1; j<=N ; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

}
