package arrays_concept;

import java.util.Arrays;
import java.util.List;

public class ArrayToList {

	public static void main(String[] args) {
/*
	Object[] o=collectionObject.toArray();
	Collection c=arrayObj.asList();
	
	public static List asList(object array);

	String[] s={"wefe","sdefde","wddw"};
	List l=Arrays.asList(s);
Note:
1. Strictly speaking these method wont create any indepent list object for the existing array we are getting list view
2.By using array reference if we perform any change automatically that change will br reflected to the List
3.similarly by using list ref we perform any change that chane will be reflected automatically to the array
4.by using list ref if we cant perform any changes in size bcz array is domaninating it is orginally arrya
it will through RE:Unsupported Operation Exception Ex:add(),Remove(); but we can set(){bcz replacing value}
5.by using list ref if we different values it wont allow if we do it RE:ArrayStoreException
 
  */
		String[] s={"bb","cc","aa"};
		List l=Arrays.asList(s);
		//s and l refering same object bcz l is vewing as list
		System.out.println(l);
		s[0]="change";
		System.out.println(l);
		l.set(0, "updated");
		for(String v:s)System.out.print(v+" ");
		
	//l.add() refer note:4
	//l.remove() refer note:4
	//l.set(1,new Integer(10))//refer note:5
		
		
		
		
	}

}
