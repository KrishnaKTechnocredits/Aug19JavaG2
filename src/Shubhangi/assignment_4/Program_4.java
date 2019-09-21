/*
 * WAP to reverse number (Consider Input as Integer not as String). 
 */

package Shubhangi.assignment_4;

import java.util.Scanner;

public class Program_4 {
	
    int digit, reverse;
    
	void reverse(int n) {
		while(n>0) {
			digit = n%10;
			reverse = reverse * 10+ digit;
			n=n/10;
		}
		
		System.out.println("Reverse number is : "+ reverse);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to reverse : ");
		int num = sc.nextInt();
		
		Program_4 p1 = new Program_4();
		p1.reverse(num);
	}
}
