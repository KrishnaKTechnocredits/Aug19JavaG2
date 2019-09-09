/*
 * WAP to reverse an array
 */

package Shubhangi.assignment_2;

import java.util.Scanner;

public class Program_13 {
	
	void reverse(int a[]) {
		
		System.out.println("Reverse array is : ");
		for(int i = a.length-1; i>=0; i--) {
			
			System.out.println(a[i]);
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
		
		
		Program_13 p13 = new Program_13();
		p13.reverse(arr);
		
	
		
	}

}
