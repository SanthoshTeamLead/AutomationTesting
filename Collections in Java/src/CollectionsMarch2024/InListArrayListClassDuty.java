package CollectionsMarch2024;

import java.util.ArrayList;

public class InListArrayListClassDuty {
	public static void main(String[] args) {
		/***  ArrayList Class
		 *  => this is A Child class Of list
		 *  => ArrayList is Adjest Size autometically When Removed or added the Element it's Known As 
		 *  => Dynamic Array 
		 *  => List Methods like :- add(),addAll(),remove(),size(),get(),set(),indexOf()
		 *  => ArrayList Duplicate Elements Are allowed and Inserion Order preserved
		 *  => Null is Possible in ArrayList
		 *  Convert To Array to ArrayList => Arrays.asList(Arrayname);
		 *  Convert To ArrayList to Array => arrList.toArray(ArrayListName);
		 */
		
		
		ArrayList<Integer> array = new ArrayList<>();
		array.add(25);
		array.add(58);
		array.add(10);
		System.out.println(array);
 		
		ArrayList<Integer> arrayTwo = new ArrayList<>();
		arrayTwo.add(10);
		arrayTwo.add(41);
		arrayTwo.add(13);
		System.out.println(arrayTwo);
		
		/*ArrayList Concatination */
		array.addAll(arrayTwo);
		
		System.out.println(array);
		
		/*In ArrayList Get The Value*/
		
		System.out.println(array.get(2));
		
		
		/*In ArrayList Set The Value*/
		array.set(1, 111);	
		System.out.println(array);
	}
}
