/*
 *  WAP to print factorial number 
 */
package Shubhangi.assignment_4;

import java.util.Scanner;

public class Program_6 {
	
	int fact=1;
	
	void reverse(int n) {

		for(int i =1; i<=n; i++) {
			fact = fact*i;
		}
		System.out.println("Factorial of a number is : "+ fact); 
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();
		
		Program_6 p1 = new Program_6();
		p1.reverse(num);
	}
}
