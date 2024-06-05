package CollectionsMarch2024;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;


public class InArrayListMoreDuty {
		public static void main(String[] args){
		/*ArrayList Slicing*/
		ArrayList<Integer> arrayCreate = new ArrayList<>();
		arrayCreate.add(14);
		arrayCreate.add(10);
		arrayCreate.add(11);
		arrayCreate.add(1);
		arrayCreate.add(1);
		arrayCreate.add(1);
		System.out.println(arrayCreate);
		System.out.println(arrayCreate.subList(1, 3));
		
		/*ArrayList Reversing*/
		
		Collections.reverse(arrayCreate);
		System.out.println(arrayCreate);
		
		
		/*Frequently Use Number in Given Array*/
		
		int Frequently = Collections.frequency(arrayCreate, (Integer)1);
		System.out.println("How Many Time Repeat One:-  " + Frequently);
		
		
		/*ArrayList Accending Order*/
		
		Integer[] a = {11,5,4,6,9,3,7};
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(a));
		Collections.sort(arr);
		System.out.println(arr);
		
		/*ArrayList Decending Order*/
		Collections.sort(arr, Collections.reverseOrder());
		System.out.println(arr);
		
		
	}
}
