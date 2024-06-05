package Programs;

import java.util.Scanner;

public class FactorialGivenNumber_13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a Number:- ");
		int num =  input.nextInt();
		int mul = 1;
		for(int i = num ; i > 0; i-- ) {
			mul *= i;
		}
		System.out.println("Given Number Factorial is :- "+ mul);
	}

}
