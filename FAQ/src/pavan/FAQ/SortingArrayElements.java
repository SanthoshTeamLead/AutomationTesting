package pavan.FAQ;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SortingArrayElements {
		public static void main(String[] args) {
			Scanner userinput = new Scanner(System.in);
			Integer[] arrayList = {12,10,5,4,23,1,0};
			System.out.println("Before Sorting ArrayList:- " + Arrays.toString(arrayList));
			Arrays.sort(arrayList);
			System.out.println("After Sorting ArrayList:- "+Arrays.toString(arrayList));
			Integer [] arr = {2,6,5};
			Arrays.sort(arrayList, Collections.reverseOrder());
			System.out.println("Decending Order:- " + Arrays.toString(arrayList));
		}
}
