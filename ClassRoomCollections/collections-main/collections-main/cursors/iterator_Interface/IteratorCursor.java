package iterator_Interface;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorCursor {

	/*
	 Iterator:we can Apply iterator concept for any collection object hence it
	  universal cursor
	 use: By using iterator we can perform both Read and Remove operation  
	 Methods: 
	 		1.public boolean hasnext();
	 		2.public object next()
	 		3.public void remove()
	 */
	
	  public static void main(String[] args) {
	
		  ArrayList<Object> a=new ArrayList<Object>();
		 
		  for(int i=0;i<10;i++) {
			  a.add(i);
		  }
		  System.out.println("Arraylist elements: "+a);
		  
		  Iterator<Object> itr=a.iterator();
		  
		  while(itr.hasNext()) {
			  Integer i=(Integer)itr.next();
			  if(i%2==0) {
				  System.out.println(i);
			  }
			  else {
				  itr.remove();
				 
			  }
//			  System.out.println(itr.next());
		  }
		 System.out.println("Arraylist elements: "+a);

	}
	  /*
	   Limitaions of Iterator:
	   1.only forward Direction
	   2.only Read and Remove method can access REPLACE AND Addition of new Object is not possible
	   */
	
}
