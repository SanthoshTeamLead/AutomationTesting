package set;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetMethods {

	public static void main(String[] args) {
		NavigableSet ns=new TreeSet();
		ns.add(00.30);
		ns.add(01.30);
		ns.add(02.30);
		ns.add(02.45);
		ns.add(03.10);
		ns.add(04.40);
		ns.add(04.55);
		ns.add(05.00);
		ns.add(06.20);
		ns.add(06.40);
		ns.add(07.20);
		ns.add(07.40);
	//1.floor(e) return Highest Element which is <=e last flight before 06.10//5 if 6.20 it return that value
		System.out.println(ns.floor(06.10));
		System.out.println(ns.floor(06.20));
//		
   //lower() return highest element which is <e 
		System.out.println(ns.lower(03.10)); //last flight before 03.10 is 02.45 eventhough we have 03.10 
		
//	//celling(e) return lowest element which is >=e 
		System.out.println(ns.ceiling(04.55));// first flight after 04.55 is same ele if not same value it will give after it
		System.out.println(ns.ceiling(04.60));
//		
//	//higher(e) return lowest Element >e
		System.out.println(ns.higher(03.10)); //even though it is there it give next value
//		
//	//pollFirst()--remove and retrun first element
		System.out.println(ns);
		System.out.println(ns.pollFirst());//0.30
		System.out.println(ns);
//	//pollLast()--remove and reuturn last elemnt 
		
		System.out.println(ns.pollLast());
		System.out.println(ns);
//	//descendingSet()//it return descending order
	System.out.println(ns.descendingSet());
	
	}

}
