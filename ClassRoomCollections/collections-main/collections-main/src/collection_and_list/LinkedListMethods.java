package collection_and_list;

import java.util.LinkedList;

public class LinkedListMethods {

	public static void main(String[] args) {
		
		LinkedList ll=new LinkedList();
		//addFirst() public void addFirst(Object o)
		ll.add(12);
		ll.add(15);
//		System.out.println(ll);
		
		ll.addFirst("sadup");
		ll.addFirst("IT Company");
		ll.addFirst("Hyd");
		
		System.out.println(ll);
		
		//addLast  public void addLast()
//		
		ll.addLast("Softech");
//		ll.addLast("Pvt Ltd");
//		
		System.out.println(ll);
//		
//		//getFirst() public Object getFirst()
//		
		System.out.println(ll.getFirst());
//		
//		//getLast() public Object getLast();
//		
		System.out.println(ll.getLast());
//		
//		//removeFirst() public Object removeFirst();
		System.out.println("first:"+ll.removeFirst());
//		
//		//removeLast() public ObjectLast()
//		
		System.out.println(ll.removeLast());
		System.out.println(ll);
		ll.addFirst("Hyd");
		ll.addLast("Hyd");
		ll.add(6,"sadup");
		System.out.println(ll);
		ll.remove(2);
//		ll.add(null);
		System.out.println(ll);
//		ll.addFirst("Hyd");
//		System.out.println(ll);
//		//removeFirstOccurrence() public boolean removeFirstOccurrence(Object o) 
//		System.out.println("removeFirstOccurrence: "+ll.removeFirstOccurrence("Hyd"));
//		System.out.println(ll);
//		System.out.println(ll);
//		ll.addFirst("Hyd");
//		
//		System.out.println(ll);
//		
//		System.out.println("removeLastOccurrence :"+ll.removeLastOccurrence("Hyd"));
//		
//		System.out.println(ll);
//		
		
		
		
		
		
		
		
		
		
	}

}
