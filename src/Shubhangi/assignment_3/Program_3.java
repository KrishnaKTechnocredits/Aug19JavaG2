/*
 * WAP to find frequency of user defined character in user defined String
 */

package Shubhangi.assignment_3;

import java.util.Scanner;

public class Program_3 {
	
	int count;
	
	void charFreq(String a, char ch) {
	
		for(int i=0; i<a.length(); i++) {
			if (ch== a.charAt(i)) {
				count++;
			}
		}
		
		System.out.println("Character occured : "+ count + " time");
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter String");
		String arr = sc.nextLine();
		
		
		System.out.println("Enter a character to count in the string");
		char c = sc. next(). charAt(0);
		
		Program_3 p1 = new Program_3();
		p1.charFreq(arr,c);
		
		sc.close();
		
	}
}
