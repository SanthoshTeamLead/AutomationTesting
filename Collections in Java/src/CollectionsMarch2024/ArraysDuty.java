package CollectionsMarch2024;

import java.util.Arrays;
import java.util.Collections;

public class ArraysDuty {
	public static void main(String[] args){
		/***
		 * Arrays is Homogenous data type it is Fixed Size 
		 * Once Creating Array the Size No incresing and No Decresing 
		 * Arrays Allows Primitive Type and  objective type  
		 */
	/*Accesing The Array Element*/
		int [] array = {25,42,56,1,2};
		System.out.println((array[1]));
	
	/*Creating New Array Element */
		int[] newarray = new int[4];
		newarray[1] = 1;
		newarray[2] = 4;
		System.out.println(Arrays.toString(newarray));
 
	/* using For loop array and length */
	for(int i = 0; i < array.length ;i++){
		System.out.println(array[i]);
	}
	/* Array Conactination */
	int arrayOne = array.length;
	int arrayTwo = newarray.length;
	
	int[] CreateArr = new int[arrayOne + arrayTwo];
	System.arraycopy(array, 0, CreateArr, 0, arrayOne);
	System.arraycopy(array,0,CreateArr, arrayOne, arrayTwo);
	
	System.out.println(Arrays.toString(CreateArr));
	
	/*Sorting Orders (Accending order)*/
	Arrays.sort(CreateArr);
	System.out.println(Arrays.toString(CreateArr));
	
	/*Sorting Orders (Decending order)*/
	Integer[] ar = {12,56,4,8,9,7,1,2,3,6,7};
	Arrays.sort(ar, Collections.reverseOrder());
	System.out.println(Arrays.toString(ar));
	
	/*Reversing Array In given List*/
	Collections.reverse(Arrays.asList(ar));
	System.out.println(Arrays.toString(ar));
	
	
	
	}
}
