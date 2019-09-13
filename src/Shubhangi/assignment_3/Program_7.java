/*
 * WAP to find Fibonacci series for user defined number
 */

package Shubhangi.assignment_3;

import java.util.Scanner;

public class Program_7 {
	int first,next = 0;
	int second = 1; 
	  
	
	void fibo(int n) {
		System.out.print(first+" "+second+" ");//printing 0 and 1  
		
		for(int i=2;i<n;++i) {
		
		next = first+second;
		System.out.print(next+" ");
		first = second;
		second = next;
		
		
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		
		Program_7 p7 = new Program_7();
		p7.fibo(num);
		sc.close();
	}
}
