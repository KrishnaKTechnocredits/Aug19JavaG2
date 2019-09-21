/*
 * WAP to character occurring in user defined String and Character 
 */

package Shubhangi.assignment_4;

import java.util.Scanner;

 public class Program_10 {
	
	 int count;
	 
	void occurance(String str, char ch) {
		for(int i =0; i<=str.length()-1; i++) {
			if(str.charAt(i)==ch){
				count++;
			}
		}
		System.out.println(" Character "+ch+" occured "+count+" times ");
	}

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter word");
		
		String s = sc.next();
		
		System.out.println("Input char");
		char c =  sc.next().charAt(0); 
		
		Program_10 p1 = new Program_10();
		p1.occurance(s, c);
		sc.close();
	}
}
