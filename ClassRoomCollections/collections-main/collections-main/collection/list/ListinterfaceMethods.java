package list;

import java.util.ArrayList;
import java.util.List;

public class ListinterfaceMethods {

	public static void main(String[] args) {
		List<Object> l=new ArrayList<Object>();
		l.add("prasanna");
		l.add("kumar");
		System.out.println("Before collection L :"+l);
		
		l.add(0, "pramod");
		//add() public void add(int index,Object obj)	
		System.out.println("After collection L:"+l);
		
		List<Object> l1=new ArrayList<Object>();
		l1.add(2);
		l1.add("DEF");
		
		//addAll() public void addAll(int index,Collection c)
		System.out.println("Before l.addAll(2, l1) collection has"+l1);
		l.addAll(2, l1);
		System.out.println("After l.addAll(2, l1) collection has"+l1);	
		
		//remove public boolean remove(int index)
		l.remove(2);
		//indexof() public int indexOf(Object o)
		l.add("pramod");
		System.out.println(l.indexOf("pramod"));//0
		
		//lastIndexOf() public int indexOf(Object o)
		l.add(2,"pramod");
		System.out.println(l);
		System.out.println(l.lastIndexOf("pramod"));//4
		System.out.println(l.lastIndexOf("kumar"));
		
		//get() public object get(int index);
		
		System.out.println(l.get(2));
		
		//set() public Object set(int index,Object newobject)
		
		System.out.println(l);
		l.set(0, "ABCD");
		System.out.println(l);
		
		//list iterator(); verify cursor
		

	}

}
