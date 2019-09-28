package SiddhiBStringAssignment;

import java.util.Scanner;

public class Asgn4P8SeparateDigitsAndCharacter 
{
	static String digits =  "";
	static String Alphabets = "";
	static void separateStringAndDigit(String  receivedStrng)
	{
		//String digits;
		//String Alphabets;
		for (int i = 0;i<=receivedStrng.length()-1;i++)
		{
		char value = receivedStrng.charAt(i);
		if ((value>=97)&&(value<=122))
		{
			Alphabets = Alphabets+value;
		}
		else 
		{
			digits = digits+value;
		}
		}
		System.out.println("Character in the string is: " + Alphabets);
		System.out.println("Digits in the string is :" + digits);
		System.out.println(Alphabets+ " " + digits);
		
	}
	public static void main(String[] args) 
	
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string to be separated");
		String strng = sc.nextLine();
		separateStringAndDigit(strng);
		
	}

}
