/*
 * WAP to reverse the word. 
 */

package Shubhangi.assignment_4;

import java.util.Scanner;

public class Program_9 {
	
	void reverse(String str) {
		for(int i =str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
	}

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter word");
		
		String s = sc.next();
		
		Program_9 p1 = new Program_9();
		p1.reverse(s);
		sc.close();
	}
}
