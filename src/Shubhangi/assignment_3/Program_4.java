/*
 * WAP to find sum of user given number.
 */

package Shubhangi.assignment_3;

import java.util.Scanner;

public class Program_4 {
	
	int sum;
	
	void sumDigit(int n) {
		 while(n > 0) {
			int num = n%10; //4
			sum = sum + num; //4
			n= n/10;//123
		 }
		 
		 System.out.println("Digit sum is : "+ sum);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter Number");
		int number = sc.nextInt();
		
		Program_4 p4 = new Program_4();
		p4.sumDigit(number);
		sc.close();
		
	}

}
