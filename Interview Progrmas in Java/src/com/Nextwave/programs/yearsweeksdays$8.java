package com.Nextwave.programs;
import java.util.Scanner;

public class yearsweeksdays$8 {
	public static void main(String[] args) { 
        Scanner  userinput = new Scanner(System.in);
        int Digit = userinput.nextInt();
        int Year = Digit /365 ;
        System.out.println("Years of:- "+Year);
        int YearReamingDays = Digit % 365 ; // Reamingdays for calcualte weeks
        int Weeks = YearReamingDays/7;
        System.out.println("Weeks of:- "+Weeks);
        int WeeksReamingDays = YearReamingDays % 7 ; // Reaming Days for calcualte days 
        System.out.println("Days of:- "+WeeksReamingDays);
        
    }
}
