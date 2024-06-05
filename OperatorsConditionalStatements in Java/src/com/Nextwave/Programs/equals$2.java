package com.Nextwave.Programs;
import java.util.Scanner;

public class equals$2 {
	public static void main(String[] args){
        Scanner userinput = new Scanner(System.in);
        int FirstDigit = userinput.nextInt();
        int SecondDigit =userinput.nextInt();
        boolean CheckCompare = (FirstDigit == SecondDigit);
        String Result = (CheckCompare)? "Equal" : "Not Equal";
        System.out.println(Result);
    }
}
