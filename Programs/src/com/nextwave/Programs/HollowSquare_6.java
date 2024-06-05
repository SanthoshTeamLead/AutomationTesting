package com.nextwave.Programs;
import java.util.Scanner;


public class HollowSquare_6 {

	public static void main(String[] args) {
		System.out.print("Enter No:- ");
		Scanner userinput = new Scanner(System.in);
		int N = userinput.nextInt();
		for(int i =1 ; i<=N; i++) {
			if(i==1 || i== N) {
				System.out.println("* ".repeat(N));
			}
			else {
				System.out.println("* "+ "  ".repeat(N-2) + "*");
			}
		}

	}

}
