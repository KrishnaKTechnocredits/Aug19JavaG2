/*
 * Second largest element
 */

package Shubhangi.assignment_2;

import java.util.Scanner;

public class Program_5 {
	int first, second =Integer.MIN_VALUE;
	
	void secondLarge(int a[]){
		
		for(int i=0; i<a.length; i++) {
			
			if(first < a[i]) {
				
				second = first;
				first = a[i];
				
			}else if(a[i] > second && a[i] != first)  {
				
				second = a[i]; 
				
				
			}
			
		}
		
		System.out.println("Second largest element is : "+ second);
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
		
		
		Program_5 p5 = new Program_5();
		p5.secondLarge(arr);
		
	}
}
