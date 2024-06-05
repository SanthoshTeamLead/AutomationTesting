package Durga.java.Lang.Package;

public class WrapperClasses {
	public static void main(String[] args) {
		//case 1
		Integer I = new Integer(10);
		Integer i = new Integer("10");
		// Integer II = new Integer("ten"); RE :- NumberFormatException
		System.out.println(I);
		System.out.println(i);
		System.out.println("****************");
		Double D = new Double(10.5);
		Double d = new Double("11.5");
		System.out.println(D);
		System.out.println(d);
		System.out.println("****************");

		//Case 2 
		Float f = new Float(10.5f);
		Float f1 = new Float("10.5f");
		System.out.println(f);
		System.out.println(f1);
		Float f2 = new Float(10.5);
		Float f3 = new Float("10.5");
		System.out.println(f2);
		System.out.println(f3);
		
		System.out.println("****************");
		//case 3
		Character c = new Character('c');
		// Character c1 = new Character("e"); This is Wrong way Character Wrapper Only One Argument
		System.out.println(c);
		
		System.out.println("****************");

		//case 4 
		Boolean b = new Boolean(true);
		Boolean b1 = new Boolean(false);
	//	Boolean b2 = new Boolean(True);
	//	Boolean b3 = new Boolean("santhu");
		System.out.println(b);;
		System.out.println(b1);
		
		System.out.println("****************");
		
		Boolean bb = new Boolean("left");
		Boolean bb1 = new Boolean("right");
		System.out.println(bb);
		System.out.println(bb1);
		System.out.println(bb.equals(bb1));
		
		
		
		}
}
