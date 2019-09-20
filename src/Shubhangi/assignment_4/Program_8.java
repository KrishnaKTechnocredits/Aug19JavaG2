/*
 * separate digits and characters from the user define string. 
 * Using ASCII method
 */

package Shubhangi.assignment_4;

import java.util.Scanner;

public class Program_8 {
	String number="";
	String letter = "";
	void separate(String a) {

		for(int i=0; i<a.length(); i++) {
			char c = a.charAt(i);
			
			 if((c>=65 && c<=90)||(c>=97 && c<=122)) {
				 letter = letter +c;
			 }else if (c>=48 && c<=57) {
				 number = number + c;
			 }
		}
		
		System.out.println(letter+" "+number);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		String num = sc.next();
		
		Program_8 p1 = new Program_8();
		p1.separate(num);
		sc.close();
	}
	
}
