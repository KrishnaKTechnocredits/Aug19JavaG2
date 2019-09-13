/*
 * WAP to print even number from array
 */

package Shubhangi.assignment_2;

import java.util.Scanner;

public class Program_14 {
	
	void even(int a[]) {
		System.out.println("Even numbers in array are : ");
		for (int i = 0; i < a.length; i++) {
			if (a[i] %2 == 0) {
				System.out.println(a[i]);
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
		
		
		Program_14 p14 = new Program_14();
		p14.even(arr);
		
	}

}
