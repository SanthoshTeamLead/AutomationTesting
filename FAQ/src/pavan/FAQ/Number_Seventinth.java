package pavan.FAQ;
/*** Rules Find Missing Number
 * => in Given array list not in sorted order
 * => if you know must range 
 * => No duplicates Elements Required
 */
public class Number_Seventinth {
		public static void main(String[] args) {
			int[] array = {2,1,4,5};
			int sum1 =0, sum2 =0;
			for(int i = 0; i<array.length; i++) {
				sum1 += array[i];
			}
			System.out.println(sum1);
			for(int i =1; i <=5; i++) {
				sum2 += i;
			}
			System.out.println(sum2);
			int Missing_Number = sum2 -sum1;
			System.out.println("Missing Number In Given ArrayList:- "+ Missing_Number);
		}
}
