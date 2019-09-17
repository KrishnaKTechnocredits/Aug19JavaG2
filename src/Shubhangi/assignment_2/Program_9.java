/*
 * Find all differ index from array2
 */

package Shubhangi.assignment_2;

import java.util.Scanner;

public class Program_9 {

void checkEqual(int a[], int b[]) {
		
		for(int i=0; i<a.length; i++) {
			
			boolean flag = false;;
			
			for(int j = 0; j<b.length; j++) {
				
				if (a[i]==b[i]) {
					flag = true;
					
				}
				
				if(flag == false) {
					System.out.println("Number is not matching at : " + i);
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
		
		Program_9  p9 = new Program_9 ();
		p9.checkEqual(arr1, arr2);
	}
	
}
