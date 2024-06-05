package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapInterfaceMethods {
/*
 Map: 
 	1.Underlying Data Structure Hastable
 	2.Insertion is not preserved and it is based on hashcode key not hashcode values
 	3.Duplicate keys are not allowed & duplate values are Allowed
 	4.key--null(only once)but for values--many times
 	5.seralizable and clonable accesse
 	6.Best choice for Searching Meachanism	
 	
 	Constructor:
 	HashMap m=new HashMap();
 	HashMap m=new HashMap(int initial capacity);
 	HashMap m=new HashMap(int initial capacity,float fillRatio);
 	HashMap m=new HashMap(map m);
 	
 	
 */
	public static void main(String[] args) {
		
		Map<String,Integer> m=new HashMap<String,Integer>();
		
		//isEmpty()
		System.out.println(m.isEmpty());
		//public int put(Object key,Object value) 
		m.put("prasanna", 10000);
		m.put("kumar", 15000);
		System.out.println(m.put("pramod", 20000));//null
		System.out.println(m.put("prasanna", 25000));//10000
		
		Map<String,Integer> m1=new HashMap<String,Integer>();
		
		m1.put("sai", 50000);
		m1.put("murali", 60000);
		m1.put("krishna", 70000);
		
		//public void putAll(map 1) 
		System.out.println("Before adding m collection:"+m);
		m.putAll(m1);
		System.out.println("After adding m collection:"+m);
		
		//public Object get(key)
		System.out.println(m.get("prasanna"));//25000
		
		//public Object remove(key)
		System.out.println(m1.remove("krishna"));//70000 it return value and remove the total Entry
		System.out.println(m1);
		System.out.println(m1.remove("xyz"));//null
		
		//public  boolean containsKey(key)
		System.out.println(m.containsKey("prasanna"));//true
		
		//public boolean containsValue(value)
		System.out.println(m.containsValue(15000));//true

		//public int size()
		System.out.println(m.size());//6
		//public setofkey keySet();
		System.out.println(m.keySet());//[pramod, murali, prasanna, sai, krishna, kumar]
		
		
		//public collection values();
		System.out.println(m.values());//[20000, 60000, 25000, 50000, 70000, 15000]
		
		//public Set<K,V> entrySet()
		System.out.println(m.entrySet());//[pramod=20000, murali=60000, prasanna=25000, sai=50000, krishna=70000, kumar=15000]
		
		//public void clear();
		m1.clear();
		System.out.println(m1);//{}
		
		//Entry(I)
		
		Set s1=m.entrySet();
		System.out.println(s1);
		
		Iterator itr=s1.iterator();
		while(itr.hasNext()) {
//			System.out.println(itr.next());
			Map.Entry<String,Integer> me=(Map.Entry<String, Integer>)itr.next();
			System.out.println(me.getKey()+"-->"+me.getValue());
			if(me.getKey().equalsIgnoreCase("kumar")) {
				me.setValue(10);
			}
		}
		System.out.println(m);
		
		
	}

}
