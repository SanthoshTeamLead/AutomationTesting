//4. Write a program to take the number of kilometers as input 
//   and convert into meters and print the number of meters.
package com.Nextwave.Programs;
import java.util.Scanner;
public class Kilometerstomeeters$4 {
	public static void main(String[] args){
        Scanner userinput = new Scanner(System.in);
        float kilometer = userinput.nextFloat();
        System.out.println((int)(kilometer*1000));
}
}