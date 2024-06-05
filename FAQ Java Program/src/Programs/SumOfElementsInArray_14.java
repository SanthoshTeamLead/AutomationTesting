package Programs;

import java.util.Scanner;

public class SumOfElementsInArray_14 {

	public static void main(String[] args) {
		int[] arry = {1,2,3,4,5};
		
		int sum =0, len = arry.length;
		System.out.println(len);
		for(int i =0 ; i <len; i++) {
			System.out.println(arry[i]);
			sum += arry[i];
		}
	
		System.out.println(sum);
		
	}

}
