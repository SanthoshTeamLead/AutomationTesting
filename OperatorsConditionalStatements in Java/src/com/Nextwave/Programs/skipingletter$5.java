package com.Nextwave.Programs;
import java.util.Scanner;

public class skipingletter$5 {
	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		String word = userinput.nextLine();
		int Digit = userinput.nextInt();
		String S1 = word.substring(0,Digit);
		String S2 = word.substring(Digit+1);
		String S = S1 + S2 ;
		System.out.println(S);
	}
}
