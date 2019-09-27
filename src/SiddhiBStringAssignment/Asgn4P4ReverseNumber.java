package SiddhiBStringAssignment;

import java.util.Scanner;

public class Asgn4P4ReverseNumber {
	static void reverseNumber(int receivedNumber)
	{
		while (receivedNumber>0)
		{
			
			int rn = receivedNumber % 10;
		    receivedNumber = receivedNumber/10;
			System.out.print(rn);	
		}
		
	}

	public static void main(String[] args) 
	
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number that needs to be reversed");
		int number = sc.nextInt();
		reverseNumber(number);
		
				
	}

}
