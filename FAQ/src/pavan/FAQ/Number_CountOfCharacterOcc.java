package pavan.FAQ;

import java.util.Scanner;

public class Number_CountOfCharacterOcc {
		public static void main(String[] args) {
			//Scanner userinput = new Scanner(System.in);
			String Word = "Santhosh Gorantala";
			int BeforeCount = Word.length();
			String OccraChar = Word.replace("a", "");
			int AfterCount = OccraChar.length();
			
			int Values =  BeforeCount-AfterCount;
			System.out.println(Values);
			System.out.println(OccraChar);
		}
}
