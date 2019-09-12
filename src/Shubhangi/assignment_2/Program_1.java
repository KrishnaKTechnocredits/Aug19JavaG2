/*
 * Find missing number in array of 1 to 10
 */

package Shubhangi.assignment_2;

import java.util.Scanner;

public class Program_1 {

	int missing() {
		Scanner sc = new Scanner(System.in);
        System.out.println("Please enter length of String array"); 
        int length = sc.nextInt();
        
        int[] arr = new int[length];
        
        System.out.println("Please enter array elements");
        
        for (int i = 0; i < length; i++) { 
        	int userInput = sc.nextInt();
        	 arr[i] = userInput; 
        }
        
        int n=arr.length+1;
		int sum=n*(n+1)/2;
		int restSum=0;
		for (int i = 0; i < arr.length; i++) {
			restSum+=arr[i];
		}
		int missingNumber=sum-restSum;
		return missingNumber;
		
		
	}
	public static void main(String[] args) {
		
        
        Program_1 p1 = new Program_1();
		int mis = p1.missing();
		System.out.println("Missing number from array is: "+mis);
	}
}
