package map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Treemapfunction {

	public static void main(String[] args) {
		
		TreeMap<String,Integer>t=new TreeMap<String,Integer>();
//		TreeMap<String,Integer>t=new TreeMap<String,Integer>(new Mycomparator());
		t.put("a", 97);
		t.put("c", 99);
		t.put("b", 98);
		t.put("i", 105);
		t.put("f", 102);
		t.put("g", 103);
		t.put("e", 101);
		t.put("d", 100);
		t.put("h", 104);
		System.out.println("comparable :"+t);

//		System.out.println("comparator: "+t);
		
		/*sorting basd on values*/
		ArrayList<Integer> list=new ArrayList<Integer>();
		LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
		for(Map.Entry<String,Integer> value:t.entrySet()) {
			list.add((Integer) value.getValue());
		}
		System.out.println(list);
		
		 Collections.sort(list, new Comparator<Object>(){
				public int compare(Object o1, Object o2) {
					Integer s1=(Integer)o1;
					Integer s2=(Integer)o2;
					if(s1<s2) {
						return +1;
					}else if(s1>s2) {
						return -1;
					}else {
						return 0;
					}
				}
	            });
		 
		 System.out.println(list);
		 
		 for (Object i :list) {
	            for (Entry<String, Integer> entry : t.entrySet()) {
	                if (entry.getValue().equals((Integer)i)) {
	                    sortedMap.put(entry.getKey(),(Integer) i);
	                }
	            }
	        }
		 
		 System.out.println(sortedMap);//{i=105, h=104, g=103, f=102, e=101, d=100, c=99, b=98, a=97}
		 
		 

}
}
class Mycomparator implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		String s1=(String)o1;
		String s2=(String)o2;
		return -s1.compareTo(s2);
	}
}