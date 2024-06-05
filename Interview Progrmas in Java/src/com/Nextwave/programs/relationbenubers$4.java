package com.Nextwave.programs;
import java.util.Scanner;

public class relationbenubers$4 {
	public static void main(String[] args) { 
        Scanner userinput = new Scanner(System.in);
        int X = userinput.nextInt();
        int Y = userinput.nextInt();
        
        if(X < Y){
            System.out.println("X < Y");
        }
        else{
            System.out.println("X >= Y");
        }
    }
}
