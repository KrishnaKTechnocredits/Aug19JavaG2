/*
 * WAP to find max length String from the given array.
 */

package Shubhangi.assignment_3;

import java.util.Scanner;

public class Program_2 {
	
	String maxName = "";
    int length = 0;
	
	void maxLength(String a[]) {
		for(int i=0; i<a.length; i++) {
			if(length < a[i].length()) {
				maxName = a[i];
				length = maxName.length();
			}
		}
		System.out.println("Max length String is : "+maxName);
		System.out.println("Having length : "+length);
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter length of String array");
		int length = sc.nextInt();
		
		String arr[]= new String[length];
		
		System.out.println("Please enter array elements");
		 
		for(int i = 0; i<arr.length; i++) {
			String userInput = sc.next();
			arr[i] = userInput ;
		}
		
		Program_2 p1 = new Program_2();
		p1.maxLength(arr);
		
		sc.close();
		
	}
	
}
