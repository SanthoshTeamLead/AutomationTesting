package collectionS_concept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BinarySearchingMethod {

	public static void main(String[] args) {
		
		/*
		 1.Before binary Search Sorting order should be done then searching order should run if not unexpected outputs For below 2 methods
		 2.if search element not present unsuccesful result give insertion point
		 Two Methods
		 a.public int binarySearch(list ,targetele);//DSNO
		 b.public int binarySearch(list target,Compartor c)C//Customixed Order
		 
		 these methos use binary algorithm 
		 if b method {if the list is sorted according to  comparator then at the time search operation also we have 
		 to pass same compartor object other wise we will get unpreticable errors}
		 
		 */
		
		ArrayList<String> al=new ArrayList<String>();
//		al.add("a");
//		al.add(1);
//		al.add("b");
//		al.add(2);
//		System.out.println(al);
//		Collections.binarySearch(al,"b");		
		al.add("aa");
		al.add("cc");
		al.add("bb");
		al.add("ff");
		al.add("ee");
		al.add("AA");
		
		 //Comparator Sorting 
		System.out.println(al);
		System.out.println(Collections.binarySearch(al, "AA"));
		System.out.println(Collections.binarySearch(al, "ff"));
		System.out.println(Collections.binarySearch(al, "bb"));
		
		System.out.println(Collections.binarySearch(al, "dd"));
		
		Collections.sort(al);
		System.out.println(al);
		System.out.println(Collections.binarySearch(al, "AA"));
		System.out.println(Collections.binarySearch(al, "ff"));
		System.out.println(Collections.binarySearch(al, "bb"));
		System.out.println(Collections.binarySearch(al, "gg"));
		System.out.println(Collections.binarySearch(al, "dd"));
		
		System.out.println(al);
		Collections.sort(al,new ImpComparator());
		System.out.println(al);
		
		System.out.println(Collections.binarySearch(al, "bb", new ImpComparator()));//3
		System.out.println(Collections.binarySearch(al, "AA", new ImpComparator()));//5
		System.out.println(Collections.binarySearch(al, "bb"));//unpredicatable//-1
		System.out.println(Collections.binarySearch(al, "dd"));//unpredicatable//-7
		System.out.println(Collections.binarySearch(al, "dd",new ImpComparator()));//-3
		
		
		/*
		 Ex :3 elements
		 Note: Succesful search result Range : 0 to 2
		 	   unsuccesful search result range is :-4 to -1
		 	   Total Result Range: -4 to 2
		 Ex : n elements
		 Note: Succesful search result Range : 0 to n-1
		 	   unsuccesful search result range is :-(n+1) to -1
		 	   Total Result Range: -(n+1) to (n-1)		 		
		 * */
		
		
	}
}
class ImpComparator implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		String s=(String)o1;
		String s1=(String)o2;
		return -s.compareTo(s1);
	}
	
}
