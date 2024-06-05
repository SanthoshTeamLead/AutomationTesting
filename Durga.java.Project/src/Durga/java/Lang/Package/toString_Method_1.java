package Durga.java.Lang.Package;


public class toString_Method_1 {
		String Name;
		int   RollNo;
		
		toString_Method_1(String Name, int RollNo){
			this.Name = Name;
			this.RollNo = RollNo;
		}
		
		public String toString() {
			
			/** Override This toString()
			 * return  getClass().getName().+"@"+Integer.toString(hashCode());
			 */
			
			return "Student Name is " +Name+ " RollNo is " + RollNo ;
			
		}
		public static void main(String[] args) {
			toString_Method_1 s = new toString_Method_1("Raju", 15);
			toString_Method_1 s1 = new toString_Method_1("santhosh", 41);
			System.out.println(s);
			System.out.println(s.toString());
			System.out.println(s1);
			
			String s2 = new String("Vijay");
			System.out.println(s2);
		}
}
