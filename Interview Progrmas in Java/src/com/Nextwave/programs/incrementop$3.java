package com.Nextwave.programs;
import java.util.Scanner;

public class incrementop$3 {
	public static void main(String[] args){
        Scanner userinput = new Scanner(System.in);
        int EnterNum = userinput.nextInt();
        int addOne = 1, Result, addFive =5 ;
        if(EnterNum <= 10){
        Result = EnterNum + addOne ;
        System.out.println(Result);
        }
        else{
            Result = EnterNum + addFive ;
            System.out.println(Result);
        }
    }
}
