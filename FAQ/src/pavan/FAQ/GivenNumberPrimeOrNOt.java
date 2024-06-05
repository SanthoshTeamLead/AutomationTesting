package pavan.FAQ;

import java.util.Scanner;

public class GivenNumberPrimeOrNOt{
	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		System.out.print("Enter a Number;- ");
		int Number = userinput.nextInt();
		int Count = 0;
		if(Number > 1) {
			for(int i = 1; i <= Number ; i++){
				if(Number%i == 0) {
					Count++;
				}
			}
			if(Count == 2) {
				System.out.println("This is Prime Number");
			}else {
				System.out.println("This is Not Prime Number");
			}
		}
		else {
			System.out.println("Given Number Not a Prime Number");
		}
	}
}