package durga.finalfinalyfinalize;

public class ExampleTwoChild extends ExampleOneParent {
	int a = 25;
	
	public void add() {
		super.add();
		System.out.println("Change addtion logic to Substraction ");
	}
	/**
	public void Multiply() {
		System.out.println("Can't OVerride Method Because Parent Method is Final ");
	}
	*/
	public static void main(String[] args) {
		
		ExampleTwoChild s = new ExampleTwoChild();
		s.add();
		System.out.println(s.a);
	}

}
