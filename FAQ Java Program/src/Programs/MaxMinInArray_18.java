package Programs;

import java.util.Arrays;

public class MaxMinInArray_18 {

	public static void main(String[] args) {
		int[] array = {10,11,5,40,18,9,88,99,101,5,999};
		int len= array.length;
		Arrays.sort(array);
		int Max =array[len-1];
		System.out.println("Maximum Value in Given Array:- " + Max);
		int Min = array[0];
		System.out.println("Minmum Value in Given Array:- " + Min);
	}

}
