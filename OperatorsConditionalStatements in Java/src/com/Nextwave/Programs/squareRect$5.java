package com.Nextwave.Programs;
import java.util.Scanner;

public class squareRect$5 {
	public static void main(String[] args){
        Scanner userinput = new Scanner(System.in);
        int length  = userinput.nextInt();
        int breadth = userinput.nextInt();
        String Result = (length == breadth) ? "Square" : "Rectangle";
        System.out.println(Result);
    }
}
