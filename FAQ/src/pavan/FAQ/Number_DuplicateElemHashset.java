package pavan.FAQ;

import java.util.HashSet;

public class Number_DuplicateElemHashset {
		public static void main(String[] args) {
			String[] array = {"raju", "sai","ravi","raghu","raju"};
			
			HashSet<String> hash = new HashSet();
		/***	
			System.out.println(hash.add("raju"));
			System.out.println(hash.add("sai"));
			System.out.println(hash.add("raju"));
		 */
			Boolean flag = false;
			for(String A : array) {
				if(hash.add(A) == false) {
					System.out.println("Duplicates Found");
					flag = true;
				}
			}
			if(flag == false) {
				System.out.println("No Duplicates Found");
			}
		}
}
