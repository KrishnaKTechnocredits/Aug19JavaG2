/*
 * Array contains a number 
 */

package Shubhangi.assignment_2;

import java.util.Scanner;

public class Program_3 {
	boolean flag;
	void checkNumber(int a[], int n){
		
		for(int i = 0; i<a.length; i++) {
			if(a[i]==n) {
				flag = true;
				
			}
		}
		
		if(flag == true) {
			System.out.println("Number found in array");
		}else {
			System.out.println("Number not found in array");
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
		
		System.out.println("Please enter number you want to find");
		int num = sc.nextInt();
		
		Program_3 p3 = new Program_3();
		p3.checkNumber(arr, num);
	}
}
