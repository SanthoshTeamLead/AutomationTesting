package com.Nextwave.programs;
import java.util.Scanner;

public class sumofprod$5 {
	public static void main(String[] args){
        Scanner userinput = new Scanner(System.in);
        int A = userinput.nextInt();
        int B = userinput.nextInt();
        if(A + B < 10){
            System.out.println(A+B);
        }
        else{
            System.out.println(A*B);
        }
        
    }
}
