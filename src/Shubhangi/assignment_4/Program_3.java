/*
 * WAP to print Fibonacci series up to user required. 
 */

package Shubhangi.assignment_4;

import java.util.Scanner;

public class Program_3 {
	
	int first, second, third;
	
	void fibo(int n) {
		first = 0;
		second = 1;
		System.out.print(first+" "+second+" ");
		
		for(int i=2;i<n;++i) {
			third = first + second;
			System.out.print(third+" ");
			second = third;
			first = second;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number");
		int num = sc.nextInt();
		
		Program_3 p1 = new Program_3();
		p1.fibo(num);
		
	}
	
}
