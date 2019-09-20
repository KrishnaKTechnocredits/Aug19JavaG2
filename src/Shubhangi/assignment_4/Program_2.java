/*
 * WAP to revers a full String and particular word also. 
 */

package Shubhangi.assignment_4;

import java.util.Scanner;

public class Program_2 {
	
	void reverse(String s) {
		System.out.print("Reverse is : ");
		for(int i = s.length()-1; i>=0 ; i--) {
			System.out.print(s.charAt(i));
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String");
		String str = sc.nextLine();
		
		Program_2 p1 = new Program_2();
		p1.reverse(str);
		
	}
}
