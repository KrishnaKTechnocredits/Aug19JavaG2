/*
 * All pairs on Integer array whose sum  is equal to given number
 */

package Shubhangi.assignment_2;

import java.util.Scanner;

public class Program_7 {
	
	void findPair(int a[], int n){
		
		for(int i=0;i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				 if (a[i] + a[j] == n) 
	                    System.out.println("(" + a[i] + ", " + a[j] + ")");
			}
			
		}
		
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
		
		System.out.println("Please enter sum");
		int num = sc.nextInt();
		
		Program_7 p7 = new Program_7();
		p7.findPair(arr, num);
	}

}
