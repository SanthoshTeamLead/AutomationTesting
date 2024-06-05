package com.Nextwave.programs;
import java.util.Scanner;


public class honorstudent$1 {
		public static void main(String[] args){
        Scanner ref = new Scanner(System.in);
        int Numberr = ref.nextInt();
        String Result = (Numberr < 10) ? "HONOR STUDENT" : "NORMAL STUDENT";
        System.out.println(Result);
    }
	
}
