package Programs;

import java.util.ArrayList;
import java.util.List;

public class CountCharInString_26 {

	public static void main(String[] args) {
		String words = "JavaAutomation";
		
		List<Character> CharArray = new ArrayList<>();
		for(char c : words.toCharArray()) {
			CharArray.add(c);
		}
		System.out.println(CharArray);
	}
}
