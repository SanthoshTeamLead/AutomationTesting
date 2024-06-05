package examples;

import java.util.Scanner;

public class voting {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		if (age<=18)
		{
			System.out.println("Teen Age");
		}else if (age>=18 && age<=40)     
		{
			System.out.println("Young Age");
		}else if (age>=40 && age<=60)
		{
			System.out.println("Middle Age");
		}else
		{
			System.out.println("Old Age");
		}
	}

}
