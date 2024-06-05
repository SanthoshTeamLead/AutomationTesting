package Programs;
import java.util.Scanner;


public class ReverseNumber_2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a Number:- ");
		int num = input.nextInt();
		String convNum = String.valueOf(num);
		int Count = convNum.length();
		String Reverse ="";
		for(int i = Count-1; i >=0 ; i--) {
			Reverse += convNum.charAt(i);
		}
		System.out.println(Reverse);
	}
}
