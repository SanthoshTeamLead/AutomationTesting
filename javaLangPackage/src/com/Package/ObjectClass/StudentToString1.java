package com.Package.ObjectClass;
//to String() Method We get String Representation of a Object
// We are Trying to Print the Object Reference Internally toString() Method Will be called 
/*public String toString() {
    return getClass().getName() + "@" + Integer.toHexString(hashCode());
}*/
//Note:- In String class, StringBuffer Class, All WrapperClasses, All Collection Classes
//       to String() is Overridden for meaning full String Representation.
public class StudentToString1{
		String  Name ;
		int 	RollNo ;
		
		StudentToString1(String s1 , int i1){
			this.Name = s1 ;
			this.RollNo = i1;
		}
		
		public static void main(String[] args) {
			StudentToString1 santhuobj  = new StudentToString1("Santhosh",21);
			StudentToString1 rajuobj  = new StudentToString1("Raju", 41);
			System.out.println(santhuobj);
			System.out.println(rajuobj);
			
		}	
		@Override
		public String toString() {
		// TODO Auto-generated method stub
		return Name + RollNo;
		}
}
/*
 * Output:- com.Package.ObjectClass.Student@515f550a
 * com.Package.ObjectClass.Student@626b2d4a
 */
