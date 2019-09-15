/*
 * WAP to reveres user given number
 */

package Shubhangi.assignment_3;

import java.util.Scanner;

public class Program_5 {
	
	int number, reversed;
	
	void reverse(int num) {
		 while(num != 0) {
	            int digit = num % 10;
	            //Multiplication by 10 adds a new place in the reversed number.
	            //reversed contains 0 * 10 + 4 = 4.
	            reversed = reversed * 10 + digit;
	            num = num /10; 
	        }
		 System.out.println("Reversed Number: " + reversed);
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter Number");
		int n = sc.nextInt();
		
		Program_5 p5 = new Program_5();
		p5.reverse(n);
		sc.close();
	}
}
