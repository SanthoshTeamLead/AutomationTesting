package com.Nextwave.Programs;
import java.util.Scanner;

public class Reversestring$7 {
	static String Num = "raju";
	static int i ;
	public static void main(String[] args){
        int len = Num.length();
        char[] arr = new char[len];
       
        for(i = 0; i < len ; i++)
        arr[i] = Num.charAt(i);
        
        for(i=(len-1); i>= 0; i --)
        System.out.print(arr[i]);
    }
}
