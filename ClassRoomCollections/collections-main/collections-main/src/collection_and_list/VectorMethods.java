package collection_and_list;

import java.util.Vector;

public class VectorMethods {

	public static void main(String[] args) {
		
		Vector<Integer> v=new Vector<Integer>();
		
	//public void addElement(Object o)
		
		v.addElement(11);
		v.addElement(22);
		v.addElement(33);
		v.addElement(44);
		
		System.out.println("Elements in v list: "+v);
		System.out.println();
		
		//public boolean removeElement(Object o) 
		System.out.println("Before remove Element in v list: "+v);		
		System.out.println(v.removeElement(33));
		System.out.println("After removing Element in v list: "+v);
		System.out.println();
		
		//public void removeElementAt(int index)
		System.out.println("Before removing at specifed index:"+v);
		v.removeElementAt(0);
		System.out.println("After removing at specifed index:"+v);	
		System.out.println();
		
		//public void removeAllElement()
		System.out.println("Before removingAll in collection :"+v);	
		v.removeAllElements();
		System.out.println("After removingAll elements in collection:"+v);	
		System.out.println();
		
		//public object elementAt()
		
		v.addElement(11);
		v.addElement(22);
		v.addElement(33);
		v.addElement(44);
		
		System.out.println("Elements in v collection: "+v);
		System.out.println("Element at index1  :"+v.elementAt(3));
		      
	        
	    }              
	
		
		
	}