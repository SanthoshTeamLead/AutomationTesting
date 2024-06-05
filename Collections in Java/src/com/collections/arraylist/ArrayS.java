package com.collections.arraylist;

import java.util.Arrays;
import java.util.Collections;

public class ArrayS {
	public static void main(String[] args) {
		Integer[] a = new Integer[3];
		a[0]= 2;
		a[2] = 15;
		a[1] =44;
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		Arrays.sort(a, Collections.reverseOrder());
		System.out.println(Arrays.toString(a));
	}
}
