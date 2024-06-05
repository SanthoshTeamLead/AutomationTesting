package com.Nextwave.Programs;
import java.util.Scanner;

public class bonussalary$6 {
	public static void main(String[] args){
        Scanner  userinput = new Scanner(System.in);
        int Salary = userinput.nextInt();
        int Years  = userinput.nextInt();
        
        if(Years > 5){
            float  Result = Salary* 5/100;
            System.out.println(Result);
        }
        else {
            System.out.println("No bonus");
        }
    }
}
