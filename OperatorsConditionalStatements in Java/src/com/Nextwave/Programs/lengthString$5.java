//5. Write a program to read a single line of input and print the number of characters 
//   in the input.

package com.Nextwave.Programs;
import java.util.Scanner;
public class lengthString$5 {
	public static void main(String[] args){
        Scanner userinput = new Scanner(System.in);
        String word = userinput.nextLine();
        int Length = word.length();
        System.out.println(Length);
}
}