package comparator_Imp;


import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorInterface {

	public static void main(String[] args) {
		
		TreeSet<String> t=new TreeSet<String>(new Mycomparator());
		t.add("aa");
		t.add("zz");
		t.add("cc");
		t.add("ff");
		t.add("ww");
		t.add("AA");
		System.out.println(t);

	}

}
class Mycomparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String s=(String)o1;
		String s1=(String)o2;
		//return s.compareTo(s1);//Ascending order
		return	-s.compareTo(s1);//Descending Order
		
	
	}
	
}
