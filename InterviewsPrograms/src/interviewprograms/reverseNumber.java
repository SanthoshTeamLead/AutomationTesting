package interviewprograms;
import java.util.Scanner;

public class reverseNumber {
		public static void main(String[] args) {
			Scanner userinput = new Scanner(System.in);
			int num = userinput.nextInt();
			String str = String.valueOf(num);
			
			StringBuffer sb = new StringBuffer(str);
			StringBuffer rev = sb.reverse();
			System.out.println(rev);
			
		}
}
