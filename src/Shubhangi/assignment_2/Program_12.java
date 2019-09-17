/*
 * Print common number from two different array 
 */

package Shubhangi.assignment_2;

import java.util.Scanner;

public class Program_12 {
	
	int[] commonNumber(int a[], int b[]) {
		
		int[] resultArray = new int[a.length+b.length];
		
		for (int i = 0; i<a.length; i++) {
			for(int j=0; j<b.length; j++) {
				if(a[i]==b[i]) {
					resultArray[i] = a[i];
				}
			}
		}
		return resultArray;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of 1st array");
		int length1 = sc.nextInt();
		
		int[] arr1 = new int[length1];
		
		System.out.println("Enter elements of 1st array");
		for(int i =0; i< length1; i++) {
			int userInput  = sc.nextInt();
			arr1[i] = userInput;
		}
		
		System.out.println("Enter length of 2nd array");
		int length2 = sc.nextInt();
		
		int[] arr2 = new int[length2];
		
		System.out.println("Enter elements of 2nd array");
		for(int i =0; i< length2; i++) {
			int userInput  = sc.nextInt();
			arr2[i] = userInput;
		}
		
		Program_12  p12 = new Program_12 ();
		int[] x = p12.commonNumber(arr1,arr2);
		
		for(int i=0;i<x.length;i++)
		{
			System.out.println("Common numbers in array is :"+x[i]);
		}
        
	}
	
}

