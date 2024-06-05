package InterviewPrograms;

import java.util.HashSet;

public class RemoveDuplicateElements {
	public static void main(String[] args) {
		
		String word = "RamashaBonomono";
		
		char[] C = word.toCharArray();
		
		HashSet<Character> hset = new HashSet<>();
		
		for(char l : C) {
			hset.add(l);
		}
		
		System.out.println(hset);
		
	}
}
