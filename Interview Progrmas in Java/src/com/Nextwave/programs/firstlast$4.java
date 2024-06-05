package com.Nextwave.programs;
import java.util.Scanner;
public class firstlast$4 {
	public static void main(String[] args) { 
        Scanner userinput = new Scanner(System.in);
        int Digit = userinput.nextInt();
        String strchar = String.valueOf(Digit);
        char FirstDigit = strchar.charAt(0);
        char LastDigit  = strchar.charAt(3);
        System.out.println((char)FirstDigit);
        System.out.println((char)LastDigit);
    }
}
