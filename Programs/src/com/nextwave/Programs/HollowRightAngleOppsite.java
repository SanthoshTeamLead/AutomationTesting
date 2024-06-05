package com.nextwave.Programs;
import java.util.Scanner;

public class HollowRightAngleOppsite {
	
	public static void main(String[] args){
		System.out.print("HollowRightTraingle Enter No:- " );
        Scanner userinput = new Scanner(System.in);
        int n = userinput.nextInt();
        for(int i =1 ; i <= n ; i++){
            for(int j = 1; j < i ; j++){
                System.out.print("  ");
            }
            for(int j = i ; j <= n ; j++){
                if(j == i || j == n || i == 1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
