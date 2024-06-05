// 6.Write a program to read a single line of input and print the first 
//   three characters in it? .

package com.Nextwave.Programs;
import java.util.Scanner;
public class fristthreechar$6 {
	public static void main(String[] args){
        Scanner userinput = new Scanner(System.in);
        String Word = userinput.nextLine();
       
        String FirstThreeChar = Word.substring(0,3);
        System.out.println(FirstThreeChar);
}
}
