package com.Nextwave.Programs;
import java.util.Scanner;

public class threenumgretest$10 {
	public static void main(String[] args){
        Scanner userinput = new Scanner(System.in);
        int A = userinput.nextInt();
        int B = userinput.nextInt();
        int C = userinput.nextInt();
        
        if(A >B && A > C){
            System.out.println(A);
        }
        else if(B > A && B > C){
            System.out.println(B);
        }else{
            System.out.println(C);
        }
    }
}
