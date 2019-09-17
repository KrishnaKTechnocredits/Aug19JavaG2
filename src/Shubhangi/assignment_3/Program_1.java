/*
 * 1)	WAP which fulfill below condition
a.	WAP to find positive and negative number from the given array  
b.	check the sum of individual.

 */

package Shubhangi.assignment_3;

import java.util.Scanner;

public class Program_1 {
	
	int pos, neg, psum, nsum;
	
	void posNumbers(int a[]) {
		System.out.println("Positive number in array are : ");
		for (int i = 0; i<a.length; i++) {
		
			if(a[i]>0) {
				psum= psum + a[i];
				System.out.print(a[i]+" ");
			}
		}
		System.out.println("");
		System.out.println("Positive number sum is : " + psum);
	}
		
	void negNumbers(int a[]) {
		
		System.out.println("Negative number in array are : ");
		
		for (int i = 0; i<a.length; i++) 
			
			if(a[i]<0) {
				nsum= nsum + a[i];
				System.out.print(a[i]+" ");
			}
		System.out.println("");
		System.out.println("Negative number sum is : " + nsum);
		
	}
		
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter length of String array");
		int length = sc.nextInt();
		
		int arr[]= new int[length];
		
		System.out.println("Please enter array elements");
		 
		for(int i = 0; i<arr.length; i++) {
			int userInput = sc.nextInt();
			arr[i] = userInput ;
		}
		
		Program_1 p1 = new Program_1();
		p1.posNumbers(arr);
		p1.negNumbers(arr);
		
	}
}
