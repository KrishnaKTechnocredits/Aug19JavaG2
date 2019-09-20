/*
 * separate digits and characters from the user define string. 
 * Using character method
 */

package Shubhangi.assignment_4;

import java.util.Scanner;

public class Program_8_version_2 {
	String num="";
	String alpha = "";
	void separate(String str) {

		StringBuffer alpha = new StringBuffer(),  
		        num = new StringBuffer(), 
				special = new StringBuffer(); 
		          
		        for (int i=0; i<str.length(); i++) 
		        { 
		            if (Character.isDigit(str.charAt(i))) 
		                num.append(str.charAt(i)); 
		            else if(Character.isAlphabetic(str.charAt(i))) 
		                alpha.append(str.charAt(i)); 
		            else
		                special.append(str.charAt(i)); 
		        } 
		       
		        System.out.println(alpha); 
		        System.out.println(num); 
		        System.out.println(special); 
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		String num = sc.next();
		
		Program_8_version_2 p1 = new Program_8_version_2();
		p1.separate(num);
		sc.close();
	}
}
