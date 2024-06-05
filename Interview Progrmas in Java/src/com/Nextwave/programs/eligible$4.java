package com.Nextwave.programs;
import java.util.Scanner;

public class eligible$4 {
	public static void main(String[] args) { 
        Scanner userinput = new Scanner(System.in);
        int M = userinput.nextInt();
        int P = userinput.nextInt();
        int C = userinput.nextInt();
        boolean FirstCase = (M>= 35 && P>= 35)&& C>=35 ;
        boolean SecodCase = (M+C >= 90 || M+P >= 90) || P+C >= 90;
        
        if(FirstCase && SecodCase ){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
}
	}

