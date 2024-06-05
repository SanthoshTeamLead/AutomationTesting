package com.Nextwave.Programs;
import java.util.Scanner;

public class masking$3 {
	public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String Word = input.nextLine();
        char[]  ch = Word.toCharArray();
        for (int i =1 ; i < ch.length-1; i++){
            ch[i]= '*' ;
        }
        String S1 = new String(ch);
        System.out.println(S1);
        
    }
}
