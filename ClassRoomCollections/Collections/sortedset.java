package collectionspackage;

import java.util.SortedSet;
import java.util.TreeSet;

public class sortedset {

	public static void main(String[] args) {
		SortedSet s=new TreeSet();
		s.add(12);
		s.add(13);
		s.add(14);
		s.add(15);
		s.add(10);
		s.add(9);
		s.add(2);
		s.add(1);
		s.add(5);
		s.add(20);
		System.out.println(s);
		System.out.println(s.first());
		System.out.println(s.last());
		System.out.println(s.headSet(10));//<10
		System.out.println(s.tailSet(13));//>=13
		System.out.println(s.subSet(11, 15));//>11,<15
////		System.out.println(s.comparator());//null bcz using Default sorting order
//		
	}

}
