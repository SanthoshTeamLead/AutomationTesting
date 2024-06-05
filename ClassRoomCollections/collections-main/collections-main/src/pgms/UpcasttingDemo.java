package pgms;
class A{
	
	static int x=30;
	static void m1() {System.out.println("A class static x variable "+x);}
	int z=200;
	void m2() {System.out.println("non statoc varaibale z value is:"+z);}
	void m3() {System.out.println("A class m3 method");}
	void m4() {System.out.println("A class m4 method");}
}

public class UpcasttingDemo extends A{

	void m5() {
		System.out.println("Child class m5 method");
	}
	static void m1() {
		System.out.println("child static ");
	}
	void m2() {System.out.println("non statoc varaibale of child class");}
	
	public static void main(String[] args) {
		
		UpcasttingDemo ud=new UpcasttingDemo();
//		System.out.println(ud.z);
//		System.out.println(x);
//		ud.m5();
//		ud.m2();ud.m3();ud.m4();m1();
		
//		A a1=new A();
//		System.out.println(a1.z);
//		A.m1();
//		a1.m2();a1.m3();a1.m3();
//		a1.m5();//cannot accsses
		
		A aa=new UpcasttingDemo();
		aa.m1();
		aa.m2();
//		
		
//		UpcasttingDemo d=(UpcasttingDemo)aa;
//		d.m1();
//		d.m5();
	}
}
