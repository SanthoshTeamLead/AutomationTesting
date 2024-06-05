package com.Nextwave.programs;
import java.util.Scanner;
	
public class masking$1 {
	public static void main(String[] args) { 
        Scanner userinput = new Scanner(System.in);
        String Word = userinput.nextLine();
        char[] ch = Word.toCharArray();
        for(int i =2 ; i<ch.length-2 ; i++){
            ch[i] ='*';
        }
        String S1 = new String(ch);
        System.out.println(S1);
    }
}
