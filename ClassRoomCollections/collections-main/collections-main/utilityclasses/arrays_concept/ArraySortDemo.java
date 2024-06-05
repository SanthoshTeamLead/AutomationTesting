package arrays_concept;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySortDemo {

	public static void main(String[] args) {
/*
 Arrays: arrays class is a utility class to define several utility methods for Arrays or Array object
 1.Sorting elements of Array
 	arrays class define the following sort methods to sort elemnets of primitive & object type arrays:
 	public void sort(Primitve[] p)--to sort accoeding DNSO
 	public void sort(Object[] o)--to sort according DNSO
 	public void sort(Object[] o,Comparator c)-Sort according customized Sorting order
 	
 	Note: we can sort primitve arrays only based on DNSO
 		  Where as Object Arrays either DNSO or CSO
 		  
 		  
 	
 */
		int[] a= {10,5,20,11,6};
		System.out.println("Primitive Arrya before sort");
		for(int v:a) {
			System.out.print(v +" ");
		}
		System.out.println();
		System.out.println("Primitive Arrya After sort");
		Arrays.sort(a);
		for(int v:a) {
			System.out.print(v +" ");
		}
		String[] s= {"AA","DD","ZZ","BB","CC"};
		System.out.println();
		System.out.println("Object Array Before Sort");
		for(String v:s) {
			System.out.print(v +" ");
		}
		System.out.println();
		System.out.println("Object Array After Sort");
		Arrays.sort(s);
		for(String v:s) {
			System.out.print(v +" ");
		}
		
		System.out.println();
		
		Arrays.sort(s,new MyOwnCompartor());
		System.out.println("object Arrays after sorting By compartor");
		for(String v:s) {
			System.out.print(v +" ");
		}
		
	}

}

class MyOwnCompartor implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		
		String s1=o1.toString();
		String s2=o2.toString();
		return s2.compareTo(s1);
	}
	
}