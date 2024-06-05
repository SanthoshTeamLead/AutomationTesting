package com.Nextwave.Programs;
import java.util.Scanner;

public class validTraingle$7 {
	public static void main(String[] args){
        Scanner userinput = new Scanner(System.in);
        int FirstT =  userinput.nextInt();
        int SecondT = userinput.nextInt();
        int ThirdT =  userinput.nextInt();
        int Result = (FirstT+SecondT+ThirdT);
        String FResult = (Result == 180) ? "It's a Triangle" : "It's not a Triangle";
        System.out.println(FResult);
    }
}
