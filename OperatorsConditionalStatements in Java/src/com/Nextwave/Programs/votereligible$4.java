package com.Nextwave.Programs;
import java.util.Scanner;

public class votereligible$4 {
	public static void main(String[] args){
        Scanner userinput =  new Scanner(System.in);
        int Enternumber = userinput.nextInt();
        String Result = (Enternumber > 18) ? "Eligible" : "Not Eligible" ;
        System.out.println(Result);
    }
}
