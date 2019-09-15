/*
 * WAP to find string which has length more than 7 character.
 */

package Shubhangi.assignment_3;

import java.util.Scanner;

public class Program_15 {
	
    int length = 0;
	void maxLengthName(String[] s, int l) {
		
		String maxName[] = new String[l];
		System.out.println("String which has length more than 7 characheter are : ");
		for(int i=0; i<s.length; i++) {
			if(s[i].length()>7) {
			String max = s[i];
			maxName[i] = max;
			System.out.println(maxName[i]);
		}
	  }
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string length");
		int length = sc.nextInt();
		
		String str[] = new String[length];
		
		System.out.println("Please enter array elements");
		
		for(int i = 0; i<str.length; i++) {
			String userInput = sc.next();
			str[i] = userInput ;
		}
		
		Program_15 p1= new Program_15();
		p1.maxLengthName(str, length);
		
		sc.close();
	
	}
}
