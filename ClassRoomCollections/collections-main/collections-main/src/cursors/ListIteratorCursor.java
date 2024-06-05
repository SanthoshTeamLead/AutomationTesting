package cursors;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorCursor {

	/*

	 List iterator:
	 1.By using listiterator we can move either to the forward direction or backward direction
	 2.we can replace and Add new object to existing list appart from it read and remove method can also be used
	 3.listitertor is child interface of iterator and hence all method of iterator default available to listiterator

	 Methods in listiterator:
	 	a.forwardDirection:
	 						1.public boolean hasNext();
	 						2.public object next();
	 						3.public int nextindex();
	 	b.BackwardDirection:
	 						4.public boolean hasPrevious();
	 						5.public Object previous();
	 						6.public int previousIndex();
	 	c.Other Method:
	 						7.public void remove();
	 						8.public void set(Object newobj);
	 						9.public void add(Object);

	 */
	public static void main(String[] args) {

		List<Object> l=new ArrayList<Object>();

		l.add("ABC");
		l.add(1);
		l.add("DEF");
		l.add("aaa");

		ListIterator<Object> lt=l.listIterator();

//		System.out.println("hasNext()"+lt.hasNext());	
System.out.println(l);

//	while(lt.hasNext()) {
//		System.out.println("Next Index value "+lt.nextIndex());
//		System.out.println("Element: "+lt.next());
//	}
//
//	while(lt.hasPrevious()) {
//		System.out.println("Previous Index value "+lt.previousIndex());
//		System.out.println("Element: "+lt.previous());
//	}




		while(lt.hasNext()) {
			System.out.println("Next Index value "+lt.nextIndex());
			System.out.println("Element: "+lt.next());
			if(lt.next().equals(1)) {
				lt.set("modifed");
				lt.add("added");
			}
			//System.out.println(lt.toString());
			
			//System.out.println("Element: "+lt.next());
//		if(lt.next().equals("ABC")) {
//			lt.set("modifed");
//			lt.add("added");
//			}
			//System.out.println("Next Index value "+lt.nextIndex());
			}
//		
//		
//		System.out.println(l);
//
//		System.out.println("------------------------");
		System.out.println(l);
		while(lt.hasPrevious()) {
			//System.out.println("Element : "+lt.previous());
			System.out.println("previous Index value : "+lt.previousIndex());
			if(lt.previous().equals("added")) {
				//lt.add("previousAdded");
				lt.remove();
			}
		}
	System.out.println(l);
//		
	}
}
