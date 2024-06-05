package MCQNEXTWAVE.mcq;

import java.util.Arrays;

public class One {
	public static void main(String[] args) {
		int[] arr1 = {21,52,63,45,14};
		int[] arr2 = {12,45,85,77,96};
		int[][] arr3 = {arr1, arr2};
		arr1[1] = 65;
		arr2[4] = 455;
		System.out.println(Arrays.deepToString(arr3));
	}
}
