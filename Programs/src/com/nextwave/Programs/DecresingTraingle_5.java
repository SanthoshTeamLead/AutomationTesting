package com.nextwave.Programs;
import java.util.Scanner;


public class DecresingTraingle_5 {

	public static void main(String[] args) {
	System.out.print("Decresing Triangle Enter No:-");
	Scanner userinput = new Scanner(System.in);
	int N = userinput.nextInt();
	for(int i = 1 ; i<= N; i++) {
		for(int j = N; j >= i ;j--) {
			System.out.print("* ");
		}
		System.out.println();
	}

	}
}
