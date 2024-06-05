package com.Nextwave.programs;
import java.util.Scanner;

public class firstlater$2 {
	public static void main(String[] args) { 
        Scanner username = new Scanner(System.in);
        String word1 = username.nextLine();
        String word2 = username.nextLine();
        String word3 = username.nextLine();
        
        char word1First = word1.charAt(0);
        char word2First = word2.charAt(0);
        char word3First = word3.charAt(0); 
        System.out.print((char)word1First);
        System.out.print((char)word2First);
        System.out.print((char)word3First);
    
    }
}
