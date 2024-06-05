package collectionsHandsOn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListConcatination {

	public static void main(String[] args) {
		//Two Merge Arrays and ArrayList 
	
		int[] arrayList1 = {12,45,6,9,7};
		
		int[] arrayList2 = {14,56,24,8,9};
		
		int lenOne = arrayList1.length;
		int lenTwo = arrayList2.length;
		
		int[] MergeArray = new int[lenOne + lenTwo];
		System.arraycopy(arrayList1,0,MergeArray,0,lenOne);
		System.arraycopy(arrayList2,0,MergeArray,lenOne,lenTwo);
		System.out.println(Arrays.toString(MergeArray));
	 	
	 
	//Concatination	
		
		ArrayList<Integer> arr1 = new ArrayList<>();
		arr1.add(21);
		arr1.add(11);
		arr1.add(81);
		arr1.add(289);
		System.out.println(arr1);
		ArrayList<Integer> arr2 = new ArrayList<>();
		arr1.add(10);
		arr1.add(18);
		arr1.add(1);
		arr1.add(29);
	//Slicing
		arr1.addAll(arr2);
		System.out.println(arr1);
		System.out.println(arr1.subList(1, 6));
		
		
	//arrays to ArrayList
		Integer[] sample = {11,2,31,18,2,18,11,2,18,56,18};
		ArrayList<Integer> ar = new ArrayList<>(Arrays.asList(sample));
	               int  repet   = Collections.frequency(ar, (Integer)2);
	               System.out.println("manytimes :-" +repet);
		
		/*
		 * System.out.println(ar); Collections.sort(ar); System.out.println(
		 * "Accending"+ ar); Collections.sort(ar,Collections.reverseOrder());
		 * System.out.println("Dccending"+ar);
		 */
    
		// arrayList to array 
		ArrayList<Integer> arr3 = new ArrayList<>();
		arr1.add(10);
		arr1.add(18);
		arr1.add(1);
		arr1.add(29);
		
		
	}

}
