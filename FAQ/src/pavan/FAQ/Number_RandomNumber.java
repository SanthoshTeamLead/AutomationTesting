package pavan.FAQ;

import java.util.Random;
import java.util.Scanner;

public class Number_RandomNumber {
		public static void main(String[] args) {
			Scanner userinput = new Scanner(System.in);
			Random rand = new Random();
			int rand_num = rand.nextInt(100);
			System.out.println("Random Number:- " + rand_num);
			
			System.out.println("New Method Random Number:- " + Math.random());
		}
}
