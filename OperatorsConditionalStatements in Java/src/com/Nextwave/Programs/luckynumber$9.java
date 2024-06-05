package com.Nextwave.Programs;
import java.util.Scanner; 

public class luckynumber$9 {
	public static void main(String[] args){
        Scanner userinput = new Scanner(System.in);
        int R, sum1=0, sum2=0;
        int A = userinput.nextInt();
        int B = userinput.nextInt();
        int Cond3 = A + B; // System.out.println(Cond3);   						
        while(A > 0){
            R = A % 10;
            sum1 = sum1 + R ;
            A = A /10;
        }                  //   System.out.println(sum1);
        while(B > 0){
            R = B % 10;
            sum2 =sum2 +R ;
            B = B /10 ;
        }                // System.out.println(sum2);
        boolean Cond1 = (A == 6 || B == 6); 
        boolean Cond2 = (sum1==6 || sum2== 6);
        
         if((Cond1 || Cond2) || Cond3 == 6){
            System.out.println("Lucky");
        }
        else{
            System.out.println("Not Lucky");
        }
        
        }
}
