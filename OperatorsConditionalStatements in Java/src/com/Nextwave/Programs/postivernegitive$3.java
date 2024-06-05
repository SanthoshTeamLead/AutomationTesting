package com.Nextwave.Programs;
import java.util.Scanner;

public class postivernegitive$3 {
	public static void main(String[] args){
        Scanner userinput = new Scanner(System.in);
        int EnterNumber = userinput.nextInt();
        if(EnterNumber > 0){
            System.out.println("Positive");
        }
        else if(EnterNumber < 0){
            System.out.println("Negative");
        }
        else {
            System.out.println("Zero");
        }
    }
}
