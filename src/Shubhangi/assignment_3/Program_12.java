/*
 * WAP to find word is palindrome or not ?
 */

package Shubhangi.assignment_3;

import java.util.Scanner;

public class Program_12 {
	
	String string= "";
	
	void palindromeString(String s) {
		
		for(int i =s.length()-1; i>=0; i--) {
			string = string + s.charAt(i);
		}
		
		if(s.equalsIgnoreCase(string))
        {
            System.out.println("The string is palindrome.");
        }
        else
        {
            System.out.println("The string is not palindrome.");
        }
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.nextLine();
		
		Program_12 p12 = new Program_12();
		p12.palindromeString(str);
		sc.close();
	}
	
}
