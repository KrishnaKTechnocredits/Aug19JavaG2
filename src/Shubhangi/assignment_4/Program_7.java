/*
 * WAP to print sum of digit(Consider Input as Integer not as String) 
 */
package Shubhangi.assignment_4;

import java.util.Scanner;

public class Program_7 {
	
	int sum, digit;
	
	void sum(int n) {

		while(n>0) {
			digit= n%10;
			sum = sum + digit;
			n = n/10;
		}
		System.out.println("Sum of digit is : "+ sum); 
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();
		
		Program_7 p1 = new Program_7();
		p1.sum(num);
		sc.close();
	}
}
