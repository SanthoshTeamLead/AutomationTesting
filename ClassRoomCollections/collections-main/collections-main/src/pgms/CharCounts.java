package pgms;

import java.util.HashMap;
import java.util.Map;

public class CharCounts {

	public static void main(String[] args) {
		String str="M.Prasanna Kumar";
		if(str==null) {System.out.println("NULL String");return;}
		if(str.isEmpty()) {System.out.println("Empty Strng");return;}
		if(str.length()==1) {System.out.println("string as Single character");return;}
		char ch[]=str.toCharArray();
		System.out.println(ch);
		Map<Character,Integer> charMap=new HashMap<Character,Integer>();
		for(Character c:ch) {
			if(charMap.containsKey(c)) {
				System.out.println("get method;"+charMap.get(c));
				charMap.put(c,charMap.get(c)+1);
			}else {
				charMap.put(c, 1);
			}
	}
		System.out.println("EntrySet :"+charMap.entrySet());
	
		for(Map.Entry<Character, Integer> data:charMap.entrySet()) {
			
				System.out.println(data.getKey()+": "+data.getValue());
			
		}
		
//        String word = "hello";
//        int count = 0;
//
//        // Create an array of size 128 to store ASCII values of all characters
//        int[] charCount = new int[128];
//
//        // Iterate through each character in the word
//        for (int i = 0; i < word.length(); i++) {
//            char ch = word.charAt(i);
//            // Increment the count for the character in the charCount array
//            charCount[ch]++;
//        }
//
//        // Iterate through the charCount array and count the number of duplicate characters
//        for (int i = 0; i < 128; i++) {
//            if (charCount[i] > 1) {
//                count += charCount[i];
//            }
//        }
//
//        System.out.println("Number of duplicate characters: " + count);
//    }

		
	}
}