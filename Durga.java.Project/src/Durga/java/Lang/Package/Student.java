package Durga.java.Lang.Package;

public class Student {
	String Name ;
	int RollNo;
	Student(String Name, int RollNo){
		this.Name = Name ;
		this.RollNo = RollNo;
	}
	
	
	
	public static void main(String[] args) {
	Student st = new Student("Santhosh", 101);
	Student s2 = new Student("Rajkumar", 102);
	Student s3 = new Student("Pavan", 103);
	Student s4 = new Student("Santhosh", 101);
	Student s5 =st;
	System.out.println(st == s4);
	System.out.println(st.equals(s4));
	System.out.println(st.equals(s5));
		
		
	}

}
