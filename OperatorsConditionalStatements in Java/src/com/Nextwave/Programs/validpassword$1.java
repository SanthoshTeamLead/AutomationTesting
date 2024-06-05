package com.Nextwave.Programs;
import java.util.Scanner;

public class validpassword$1 {
	public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String Word = input.nextLine();
        int length_Word = Word.length();
        if( length_Word > 7){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
