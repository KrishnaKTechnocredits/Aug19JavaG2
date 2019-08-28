/*
 * Given two numbers print absolute sum between two numbers and if difference is negative then multiply value by -1
 */

package Shubhangi;

public class Program_7 {

	int difference;
	
	int diff(int num1, int num2) {
		difference = num1 - num2;
		 if(difference < 0 ) {
			 difference = difference * -1;
		 }
	return difference;
	}
	
	public static void main(String[] args) {
		
		Program_7 p1 = new Program_7();
		System.out.println(p1.diff(5,10));
		
	}
}
