package pgms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class ArrayListNotThreadSafe extends Thread{

	public static void main(String[] args) {
//       List<Integer> list = Collections.synchronizedList(new ArrayList<>());
      List<Integer> list =new ArrayList<>();
//      List<Integer> list =new Vector<>();
      
  	list.add(10);
  	list.add(20);
  	list.add(30);
  	list.add(40);
        // Start two threads that will simultaneously modify the ArrayList
        new Thread(() -> {
//            for (int i = 0; i < 10; i++) {
//                list.add(i);
//				System.out.println(" Adding to  list:"+list);
//
//            }

        	list.remove(2);
        	System.out.println(" Thread 1 list:"+list);
        }).start();

        new Thread(() -> {
//            for (int i = 0; i < 10; i++) {
//               // list.remove(5);
//                try {
////					list.remove(i);
//                	list.remove(i);
//				} catch (Exception e) {
//					// TODO Auto-generated catch block
////					e.printStackTrace();
//					System.out.println(" removing from list:"+list);
//				}
//            }
        	list.remove(2);
        	System.out.println("Thread 2 list:"+list);
        }).start();
        
    }

//output for vector
	/*
	Adding to  list:[0]
			 removing from list:[]
			 Adding to  list:[1]
			 removing from list:[1]
			 Adding to  list:[1, 2]
			 Adding to  list:[1, 2, 3]
			 removing from list:[1, 2, 3]
			 Adding to  list:[1, 2, 3, 4]
			 removing from list:[1, 2, 3, 4]
			 Adding to  list:[1, 2, 3, 4, 5]
			 removing from list:[1, 2, 3, 4, 5]
			 Adding to  list:[1, 2, 3, 4, 5, 6]
			 removing from list:[1, 2, 3, 4, 5, 6]
			 Adding to  list:[1, 2, 3, 4, 5, 6, 7]
			 removing from list:[1, 2, 3, 4, 5, 6, 7]
			 Adding to  list:[1, 2, 3, 4, 5, 6, 7, 8]
			 removing from list:[1, 2, 3, 4, 5, 6, 7, 8]
			 Adding to  list:[1, 2, 3, 4, 5, 6, 7, 8, 9]
			 removing from list:[1, 2, 3, 4, 5, 6, 7, 8, 9]

//*/
	
}
