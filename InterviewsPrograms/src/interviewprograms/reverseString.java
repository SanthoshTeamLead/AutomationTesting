package interviewprograms;
import java.util.Scanner;



public class reverseString {
	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		System.out.print("Enter a Word:- ");
		String word = userinput.nextLine();
		
		StringBuilder sb = new StringBuilder();
		StringBuilder rev = sb.append(word);
		StringBuilder rever = rev.reverse();
		System.out.println(rever);
	}
}
