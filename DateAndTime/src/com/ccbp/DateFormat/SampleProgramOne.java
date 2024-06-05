package com.ccbp.DateFormat;

import java.time.LocalDate;

public class SampleProgramOne {

	public static void main(String[] args) {
		LocalDate dateobj = LocalDate.of(2021, 01, 31);
		System.out.println(dateobj);
		System.out.println(dateobj.getYear() + " ");  // ----> 2021
		System.out.println(dateobj.getMonth() + " "); // ----> JANUARY 
		System.out.println(dateobj.getMonthValue() + " ");//-> 1
		System.out.println(dateobj.getDayOfMonth()); //  ----> 31 
		System.out.println(dateobj.getDayOfWeek());  //  ---->SUNDAY
		System.out.println(dateobj.getDayOfWeek().getValue()); //-> 7 
		
		// If you want to print Today Date Use "now()" method 
		LocalDate objvar =  LocalDate.now();
		System.out.println("Today date:-  "+ objvar);
		System.out.println(dateobj.plusYears(20));
		System.out.println(dateobj.plusMonths(11));
		System.out.println(dateobj.plusDays(14));
		if(dateobj.compareTo(objvar) > 0) {
			System.out.println("dateobj > objvar");
		}else if(dateobj.compareTo(objvar) < 0){
			System.out.println("dateobj < objvar");
		}else{
			System.out.println("dateobj = objvar");
			}
		
	}

}
