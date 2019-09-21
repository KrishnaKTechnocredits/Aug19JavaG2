/*
 * WAP to check if a number is Armstrong or not
 */

package Shubhangi.assignment_4;

import java.util.Scanner;

public class Program_5 {
	
int temp, digit, sum;
    
	void reverse(int n) {
		
		temp = n;
		
		while(n>0) {
			digit = n%10; 
			sum= sum+(digit* digit*digit);
			n=n/10;
		}
		
		if(temp == sum) {
			System.out.println("number is armstrong");
		}else {
			System.out.println("number is not armstrong");
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();
		
		Program_5 p1 = new Program_5();
		p1.reverse(num);
	}

}
