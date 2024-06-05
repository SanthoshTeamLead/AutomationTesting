package collectionS_concept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ReverseMethodvsReverseOrderMethod {

	public static void main(String[] args) {
		
		//reverse()--we can use reverse method to reverse the postion of ele in the  list
		ArrayList<Integer> l=new ArrayList<Integer>();
		l.add(50);
		l.add(0);
		l.add(10);
		l.add(20);
		l.add(5);
		System.out.println(l);
		Collections.reverse(l);
		System.out.println(l);
		
		//reverseOrder()--we can use this to get reversed comparator
		Collections.sort(l, Collections.reverseOrder());
		System.out.println(l);
		
		Collections.sort(l,Collections.reverseOrder(new ImpComparator1()));
		System.out.println(l);
//		Comparator.??????????????????????????
	}

}

class ImpComparator1 implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		Integer s=(Integer)o1;
		Integer s1=(Integer)o2;
		return -s.compareTo(s1);
	}
	
}
