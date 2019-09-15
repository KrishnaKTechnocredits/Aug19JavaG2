/*
 * WAP to find reverse max length string 
 */

package Shubhangi.assignment_3;

import java.util.Scanner;

public class Program_6 {
	
	int maxLength, reverse = 0;
	String max;  
	
	String MaxLength(String arr[]) {
		
		for(int i =0; i< arr.length; i++) {
			if(maxLength< arr[i].length()) {
				maxLength=arr[i].length();
				max = arr[i];
			}
		}
		
		System.out.println("Output Max length string  : " + max + " having length : " + maxLength );
		return max;
	}
	
	void reverse(String s){
		System.out.print("Max length string reverse value: ");
		for(int i =s.length()-1; i>=0; i--) {
            			System.out.print(s.charAt(i)+"");
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string length");
		int length = sc.nextInt();
		
		String s[] = new String[length];
		
		System.out.println("Please enter array elements");
		
		for(int i = 0; i<s.length; i++) {
			String userInput = sc.next();
			s[i] = userInput ;
		}
		
		Program_6 p6 = new Program_6 ();
		String maxLenthString = p6.MaxLength(s);
		p6.reverse(maxLenthString);
		
	}

}
