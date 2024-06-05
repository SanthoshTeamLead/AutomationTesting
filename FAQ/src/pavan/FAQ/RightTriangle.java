package pavan.FAQ;

import java.util.Scanner;

public class RightTriangle {
		public static void main(String[] args) {
			Scanner userinput = new Scanner(System.in);
			System.out.print("Enter Number:- ");
			int Num = userinput.nextInt();
			
			for(int i = 1 ; i <= Num ; i++) {
				for(int j = 1 ; j <= i ; j++) {
					System.out.print(j + " ");
				}
				System.out.println();
			}
		}
}
