//3. Write a program to calculate the perimeter of a rectangle.

package com.Nextwave.Programs;
import java.util.Scanner;
public class permitofrectangle$3 {
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
    int L = input.nextInt();
    int B = input.nextInt();
    int Result = 2*(L+B);
    System.out.println(Result);
}
}