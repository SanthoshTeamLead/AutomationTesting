package com.Nextwave.Programs;
import java.util.Scanner;

public class between25t75$2 {
	public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int Digit = input.nextInt();
        if(Digit > 25 && Digit <75) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
        
    }
}
