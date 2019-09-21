/*
 * WAP to find given string is palidrome or not 
 */

package Shubhangi.assignment_4;

import java.util.Scanner;

public class Program_11 {
	
	void palindrome(String str) {
		
		String reverse = "";
		
		for(int i = str.length()-1; i>=0; i--) {
			reverse = reverse + str.charAt(i);
		}
		
		if (str.equals(reverse))
	         System.out.println(str+" is a palindrome");
	      else
	         System.out.println(str+" is not a palindrome");
		
	}
		
	

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter word");
		
		String s = sc.nextLine();
		
		Program_11 p1 = new Program_11();
		p1.palindrome(s);
		sc.close();
	}
}
