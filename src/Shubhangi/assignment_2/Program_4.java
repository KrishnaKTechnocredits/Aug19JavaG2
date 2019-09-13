/*
 * Largest and smallest number in array
 */

package Shubhangi.assignment_2;

import java.util.Scanner;

public class Program_4 {
	
	
	
	void largeSmall(int a[]){
		
		int max= a[0];
		int min= a[0];
		
		for (int i = 1; i < a.length; i++)
		{
			if (a[i] > max) 
			{
				max = a[i];
			}
			if (a[i] < min) 
			{
				min = a[i];
			}
		}
			System.out.println("large number is : " + max);
			System.out.println("Small number is : " + min);
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
		
		Program_4 p4 = new Program_4();
		p4.largeSmall(arr);
	}

}
