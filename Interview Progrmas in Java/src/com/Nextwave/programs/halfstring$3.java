package com.Nextwave.programs;
import java.util.Scanner;
public class halfstring$3 {
	public static void main(String[] args) { 
        Scanner userinput = new Scanner(System.in);
        String Name = userinput.nextLine();
        int Len = Name.length();
        int SecodHalf = Len / 2 ;
        
        System.out.println(Name.substring(SecodHalf));
    }
}
