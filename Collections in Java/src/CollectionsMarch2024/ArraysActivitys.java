package CollectionsMarch2024;

import java.util.Arrays;
import java.util.Collections;

/***
 * Arrays Is Fixed size And homogenious data type 
 * First You can Declare Array You can't Incresing And Decresing the Size 
 * Arrays Can allow Primitive type and Objective Type 
 */
public class ArraysActivitys {
		public static void main(String[] args){
			int [] array = new int[5];
			array[0] = 15;
			array[1] = 6;
			array[2] = 8;
			array[3] = 9;
			array[4] =10;
			 System.out.println(Arrays.toString(array));
			int [] array2 = {14,56,42,12,0};
			System.out.println(Arrays.toString(array2));
			
		//Arrays Concatination:- 	
		 int arrayOne = array.length;
		 int arrayTwo = array2.length;
		 
		 int [] newArray = new int[arrayOne + arrayTwo];
		 
		 System.arraycopy(array, 0, newArray, 0, arrayOne);
		 System.arraycopy(array2, 0, newArray,arrayOne, arrayTwo);
		 
		 System.out.println("After Concatination:- "+  Arrays.toString(newArray));
		
		 //Accending order 
		 
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		
		//Decending Order 
		Integer[] arr = {55,4,0,6,8,9,77,99,101,3,1}; 
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println(Arrays.toString(arr));
		
		// reverse Order 
		Collections.reverse(Arrays.asList(arr));
		System.out.println(Arrays.toString(arr));
		}
}
