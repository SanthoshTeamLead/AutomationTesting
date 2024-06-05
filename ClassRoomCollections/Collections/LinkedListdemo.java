package collectionspackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LinkedListdemo {

	public static void main(String[] args) {
       ArrayList al=new ArrayList<>();
       al.add(12);
       al.add(12);
       al.add(12);
       al.add(13);
       al.add(17);
       al.add(null);
       al.add(null);
       al.add(null);
       al.add(null);
       
       al.add(12);
       al.add(15);
       al.add(12);
       al.add(15);
       al.add(16);
   
       System.out.println("Before removing duplicates :"+al);
       
  Set s=new HashSet<>();
  s.add(null);
  s.add(null);
  System.out.println(s);
 ArrayList ListWithoutDuplicates = new ArrayList();
     for(Object item:al) {
    	 if(s.add(item)) {
    		 ListWithoutDuplicates.add(item);
    	 }
     }

//       System.out.println("After Removing duplicates "+ListWithoutDuplicates );
	}

}
