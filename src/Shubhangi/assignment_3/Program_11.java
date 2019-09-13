/*
 * WAP to find to number is palindrome or not.
 */

package Shubhangi.assignment_3;

import java.util.Scanner;

public class Program_11 {
	int reverse;
	int temp;
	
	void palindrome(int n) {
		temp = n;
		while(n>0) {
			int digit = n%10;
			reverse = reverse*10+digit;
			n = n/10;
		}
		
		if(temp ==reverse) {
			System.out.println("Number is palindrome");
		}else {
			System.out.println("Number is not palindrome");
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		
		Program_11 p11 = new Program_11();
		p11.palindrome(num);
		sc.close();
	}
	
}
