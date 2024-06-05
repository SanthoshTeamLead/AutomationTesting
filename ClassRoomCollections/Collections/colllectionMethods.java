package collectionspackage;

import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.ArrayList;

public class colllectionMethods {

	public static void main(String[] args) {
		
//		List li=new ArrayList();
//		li.add("abc");
//		li.add("def");
//		li.add("ghi");
//		li.add("abc");
//		li.add("xyz");
//		li.add("abc");
//		li.add(1324);
//		System.out.println(li);
//	Object[] data=li.toArray();
//	System.out.println(data[6]);
		
		
//		LinkedList ll=new LinkedList<>();
//		ll.addFirst("abc");
//		ll.add(1, "xyz");
//		ll.addLast("def");
//		ll.addLast("zyx");
//	System.out.println(ll.getLast());
//	System.out.println(ll.getFirst());
//	System.out.println(ll);
//	System.out.println(ll.removeFirst());
//	System.out.println(ll);
//	System.out.println(ll.removeLast());
//	System.out.println(ll);
//	System.out.println(ll.indexOf(2));
//	System.out.println(ll.get(2));
//	System.out.println(ll.remove(""));

	ArrayList al=new ArrayList<>();
//	al.add("abc");
//	al.add(1, "xyz");
//	al.add("def");
//	al.add("zyx");
//	System.out.println(al);
//	System.out.println(al.indexOf("xyz"));
//	System.out.println(al.get(2));
	Stack s=new Stack();
	s.push("abc");
	s.push("def");
	s.push("xyz");
	s.push(123);
//	System.out.println(s);
	s.pop();
//	System.out.println(s);
	s.pop();
//	System.out.println(s);
//	System.out.println(s.peek());
//	s.pop();
//	s.pop();
	System.out.println(s.search("abc"));
	
	}

}
