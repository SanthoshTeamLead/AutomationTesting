package com.Nextwave.programs;
import java.util.Scanner;
public class eligible$3 {
	public static void main(String[] args) { 
        Scanner userinput = new Scanner(System.in);
        int M = userinput.nextInt();
        int P = userinput.nextInt();
        int C = userinput.nextInt();
        boolean FirstCase = (M+P >= 100 || M+C >= 100) || P+C >= 100 ;
        if(FirstCase && M+P+C >=180){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
