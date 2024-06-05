package com.Nextwave.programs;
import java.util.Scanner;

public class eligible$5 {
	 public static void main(String[] args) { 
	        Scanner userinput = new Scanner(System.in);
	        int M = userinput.nextInt();
	        int P = userinput.nextInt();
	        int C = userinput.nextInt();
	        boolean FirstCase = ((M>=60 && P>= 50)&& C>= 45) && (M+P+C >= 180);
	        boolean Secondcase =(M+P >=  120) || (C+P >= 110);
	        
	        if(FirstCase || Secondcase){
	            System.out.println("True");
	        }
	        else{
	            System.out.println("False");
	        }
}
	 }
