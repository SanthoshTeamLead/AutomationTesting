package com.Nextwave.programs;
import java.util.Scanner;

public class stringrepetition$7 {
	 public static void main(String[] args) { 
	        Scanner userinput = new Scanner(System.in);
	        String Name = userinput.nextLine();
	        int N = userinput.nextInt();
	        System.out.print((Name+" ").repeat(N));
	    }
}
