package com.Nextwave.Programs;
import java.util.Scanner;

public class examresult$4 {
	public static void main(String[] args){
        Scanner userinput = new Scanner(System.in);
        int EnterNumber = userinput.nextInt();
        if(50<EnterNumber){
            System.out.println("PASS");
        }
        else{
            System.out.println("FAIL");
        }
    }
}
