package sortings;

import java.util.TreeSet;

public class ComparableInterface {

	public static void main(String[] args) {
		TreeSet<Integer> t=new TreeSet<Integer>();
		
		t.add(40);
		t.add(null);
		t.add(55);
		t.add(70);
		t.add(8);
		
	System.out.println(t);
	
	/*In comparable 
	syntax : public int obj1.compareTo(obj2){}
	1.If obj1 is before Obj2 retrun -1
	2.If obj1 is after obj2 return +1;
	3.If obj1 is equal objj2
	
	 */

	}

}
