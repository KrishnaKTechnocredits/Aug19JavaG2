/*
 * WAP to separate numeric and string value from the array
 */

package Shubhangi.assignment_4;

import java.util.Scanner;

public class Program_12 {
	
	String num= "";
	String letter = "";
	int count;
	
	void sepNumChar(String s[]) {
	
		for (int i = 0; i < s.length; i++) 
	    {
                char b = s[i].charAt(i);
                if (Character.isDigit(b)){
                    num = num+ b;
                }else if(Character.isAlphabetic(b)) {
                	letter = letter + b;
                }
            
	    }
		
		System.out.println("Numeric are : "+ num);
		System.out.println("alphabetic are : " + letter);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string length");
		int length = sc.nextInt();
		
		String str[] = new String[length];
		
		System.out.println("Please enter array elements");
		
		for(int i = 0; i<length; i++) {
			String userInput = sc.next();
			str[i] = userInput ;
		}
		
		Program_12 p1= new Program_12();
		
		p1.sepNumChar(str);
		
		sc.close();
	}

}
