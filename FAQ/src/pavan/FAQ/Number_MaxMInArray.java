package pavan.FAQ;

import java.util.Arrays;

public class Number_MaxMInArray {
	public static void main(String[] args) {
		int[] arraylist = {12,56,25,68,4,66,99,101};
		System.out.println("Before sort" + Arrays.toString(arraylist));
		Arrays.sort(arraylist);
		int len = arraylist.length;
		System.out.println("After sort" + Arrays.toString(arraylist));
		System.out.println("Minimum value:- " + arraylist[0]);
		System.out.println("Maximum Value:- " + arraylist[len-1]);
	}
}
