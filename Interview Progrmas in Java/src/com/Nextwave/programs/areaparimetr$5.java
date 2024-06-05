package com.Nextwave.programs;
import java.util.Scanner;

public class areaparimetr$5 {
	public static void main(String[] args) { 
        Scanner userinput = new Scanner(System.in);
        int Digit = userinput.nextInt();
        int AreaOfSquare = (Digit * Digit);
        int PerimeterOfSquare = 2*(Digit + Digit);
        System.out.println("Area of the square is: " + AreaOfSquare);
        System.out.println("Perimeter of the square is: " + PerimeterOfSquare);
    }
}
