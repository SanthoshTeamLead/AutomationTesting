package list;

import java.util.Stack;

public class StackMethods {

	public static void main(String[] args) {
		
		Stack<String> s=new Stack<String>();
		
//		//empty();
		System.out.println(s.empty());
		
		//1 Object push(Object o)
		
		s.push("Grandson");
		s.push("Son");
		s.push("Father");
		s.push("GrandFather");//Last in First Out
		
		System.out.println(s);
		
		//2. Object pop()
		
		System.out.println(s.pop());
//		
		System.out.println(s);
//		
//		//3. Object peek()
//		
		System.out.println(s.peek());
//		
//		
//		//4.search() int search(Object o) offSet values  [Grandson(4), Son(3), Father(2), GrandFather(1)]
//		
		System.out.println(s.search("Son"));
		System.out.println(s.search("xyz"));//-1

		
		
	}

}
