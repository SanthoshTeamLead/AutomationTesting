package com.Nextwave.Programs;
import java.util.Scanner;

public class validtraingle2$8 {
	public static void main(String[] args){
        Scanner userinput = new Scanner(System.in);
        int FirstI  = userinput.nextInt();
        int SecondI = userinput.nextInt();
        int ThridI  = userinput.nextInt();
        
        if((SecondI + ThridI > FirstI && ThridI + FirstI > SecondI) && FirstI+ SecondI > ThridI){
            System.out.println("It's a Triangle");
       }
       else{
            System.out.println("It's not a Triangle");
        }
    }
}
