/*
 * Find max value at differ index from given arrays
 */

package Shubhangi.assignment_2;

import java.util.Scanner;

public class Program_10 {

	void findMaxIndex(int a[], int b[]) {
		for(int i=0; i<a.length; i++) {
			
			boolean flag = false;;
			
			for(int j = 0; j<b.length; j++) {
				
				if (a[i]==b[i]) {
					flag = true;
					
				}
				if(flag == false) {
					System.out.println("Number is not matching at : " + i);
					if(a[i] > b[i]) {
						System.out.println("from("+a[i]+","+b[i]+") max value is : " + a[i]);
					}else {
						System.out.println("from("+a[i]+","+b[i]+") max value is : " + b[i]);
					}
					break;
				}
				
			}
		}
		
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
		
		Program_10  p10 = new Program_10 ();
		p10.findMaxIndex(arr1, arr2);
	}
	
}
