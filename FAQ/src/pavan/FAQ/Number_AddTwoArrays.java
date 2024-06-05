package pavan.FAQ;

import java.util.Arrays;

public class Number_AddTwoArrays {
	public static void main(String[] args) {
		int[] arrayone = {2,3,6,5,8};
		int[] arraytwo = {6,5,8,9,7};
		
		int one = arrayone.length;
		int two = arraytwo.length;
		
		int[] newArray = new int[one + two];
		System.arraycopy(arrayone, 0, newArray, 0, one);
		System.arraycopy(arraytwo, 0, newArray, one, two);
		
		System.out.println(Arrays.toString(newArray));
	}
}
