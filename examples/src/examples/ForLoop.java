package examples;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println("++++++++++++++++++++++");
		for(int r =0 ; r <n ; r++) {
			for(int c =n; c > r ; c--) {   // r, c = 0,0 => 
				System.out.print("* ");
			}
			
			System.out.println();
		}
		System.out.println("++++++++++++++++++++++");
		//Right angle 
		for(int r =0 ; r <n ; r++) {
			for(int c =0; c <= r ; c++) {   // r, c = 0,0 => 
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("++++++++++++++++++++++");
		//Square 
		for(int r =0 ; r <n ; r++) {
			for(int c =0; c < n ; c++) {   // r, c = 0,0 => 
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("++++++++++++++++++++++");
		
		
		        for(int i = 1; i <= n ; i++){
		            for(int j = 1 ; j<i ;j++){
		                System.out.print("  ");
		            }
		            for(int j = i; j<= n ; j++){
		                System.out.print("* ");
		            }
		            System.out.println();
		        }
	    System.out.println("++++++++++++++++++++++");      
	    for(int i = 1 ; i <=n ; i++){
            for(int j = 1; j <= i ; j++){
                if(i == n || j == 1 || j == i) {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        } 
	    System.out.println("++++++++++++++++++++++");
	    // 1st Half Pyramid
        for(int i =1 ; i<=n ; i++){
            for(int j =1 ; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j =1 ; j<= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        // 2nd Half Pyramid 
        for(int i = 1; i<=n-1; i++){
            for(int j =1; j<=i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=n-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
		
	}
}
