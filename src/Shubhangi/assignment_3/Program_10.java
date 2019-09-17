/*
 * WAP to sum of two array
 */

package Shubhangi.assignment_3;

import java.util.Scanner;

public class Program_10 {
	int firstSum, secondSum, total;
	
	void sum(int a[], int b[]) {
		for(int i = 0; i<a.length; i++) {
			firstSum= firstSum+a[i];
			
		}
		for(int i = 0; i<b.length; i++) {
			secondSum= secondSum+b[i];
			
		}
		total= firstSum+ secondSum;
		System.out.println("Sum of two array is : " + total);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter length of array1");
		int length = sc.nextInt();
		
		int arr[]= new int[length];
		
		System.out.println("Please enter array1 elements");
		 
		for(int i = 0; i<arr.length; i++) {
			int userInput = sc.nextInt();
			arr[i] = userInput ;
		}
		
		System.out.println("Please enter length of array2");
		int length1 = sc.nextInt();
		
		int arr1[]= new int[length1];
		
		System.out.println("Please enter array2 elements");
		 
		for(int i = 0; i<arr1.length; i++) {
			int userInput = sc.nextInt();
			arr1[i] = userInput ;
		}
		
		Program_10 p1 = new Program_10();
		p1.sum(arr,arr1);
	}
	
}
