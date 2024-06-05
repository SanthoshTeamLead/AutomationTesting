//CountSumOfDigits in A Number 
package examples;

import java.util.Scanner; //897469

public class CountSumDigits {

	public static void main(String[] args) {
	Scanner input  = new Scanner(System.in);
	System.out.print("Enter A Number:- ");
	long Num = input.nextLong();
	String ConWord = String.valueOf(Num);
	int sum =0 ;
    int len = ConWord.length(); //5 0to 4
    
	for(int i =0; i <=len-1 ;i++) {
	char A 	=ConWord.charAt(i);
	// System.out.println(A);
	int N = Character.getNumericValue(A);
	sum += N;
	}
	System.out.println(sum);
	}

}
    
			

