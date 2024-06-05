package arrays_concept;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysBinarySearchDemo {

	public static void main(String[] args) {
/*
 Arrays-- Arrays class define the following binary search methods
 	1.public static int binarySearch(primitive[] p,primitive target);
 	2.public static int binarySearch(Object[] a,Object target);
 	3.public static int binarySearch(Object[] a,Object target,Compartor c);
Note : All rules of Arrays class binary serch methods or exactly same as collections class binary search methods 	 
*/
		int[] a= {10,5,20,11,6};
		
		System.out.println(Arrays.binarySearch(a, 6));
		System.out.println(Arrays.binarySearch(a, 25));
		
		Arrays.sort(a);
		System.out.println(Arrays.binarySearch(a, 6));
		System.out.println(Arrays.binarySearch(a, 25));
		
		String[] s= {"AA","DD","EE","BB","CC"};
		System.out.println(Arrays.binarySearch(s, "CC"));
		System.out.println(Arrays.binarySearch(s, "xx")); 
		Arrays.sort(s);
		for(String v:s) {
			System.out.print(v +" ");
		}
		
		System.out.println();
		
		System.out.println(Arrays.binarySearch(s,"CC"));
		System.out.println(Arrays.binarySearch(s, "xx"));
		
		Arrays.sort(s,new MyCompartorTest());
		for(String v:s) {
			System.out.print(v +" ");
		}
		System.out.println();
		
		System.out.println(Arrays.binarySearch(s,"AA",new MyCompartorTest()));
		System.out.println(Arrays.binarySearch(s, "xx",new MyCompartorTest()));
		System.out.println(Arrays.binarySearch(s,"AA"));
		System.out.println(Arrays.binarySearch(s,"xx"));
		
		

		
		
		
	}

}

class MyCompartorTest implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		
		String s1=o1.toString();
		String s2=o2.toString();
		return s2.compareTo(s1);
	
}
}