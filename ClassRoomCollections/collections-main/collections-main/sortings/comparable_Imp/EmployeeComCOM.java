package comparable_Imp;


import java.util.Comparator;
import java.util.TreeSet;

public class EmployeeComCOM implements Comparable<Object>{
int Emid;
String Ename;

public EmployeeComCOM(int Emid,String Ename) {
	this.Emid=Emid;
	this.Ename=Ename;
}
	
	public static void main(String[] args) {
		EmployeeComCOM e=new EmployeeComCOM(105,"prasanna");
		EmployeeComCOM e1=new EmployeeComCOM(102,"kumar");
		EmployeeComCOM e2=new EmployeeComCOM(104,"china");
		EmployeeComCOM e3=new EmployeeComCOM(101,"pramod");
		
		TreeSet<Object> t=new TreeSet<Object>();
		t.add(e);
		t.add(e1);
		t.add(e2);
		t.add(e3);
//		System.out.println(t);
		
		TreeSet<Object>t1=new TreeSet(new OwnComparator());
		t1.add(e);
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		System.out.println(t1);
	}

	public String toString() {
	return Emid+"  "+Ename;	
	}
	
//	@Override
	public int compareTo(Object o) {
	 int eid1=this.Emid;
		EmployeeComCOM ecc=(EmployeeComCOM)o;
		int eid2=ecc.Emid;
		if(eid1<eid2) {
			return +1;
		}else if(eid1>eid2) {
			return -1;
		}else {
			return 0;
		}
	}

}
class OwnComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		EmployeeComCOM e1=(EmployeeComCOM)o1;
		EmployeeComCOM e2=(EmployeeComCOM)o2;
		String s1=e1.Ename;
		String s2=e2.Ename;
		return -s1.compareTo(s2);
	}
	
}
