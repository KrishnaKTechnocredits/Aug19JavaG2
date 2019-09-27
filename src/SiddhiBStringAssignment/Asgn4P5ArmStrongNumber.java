package SiddhiBStringAssignment;

import java.util.Scanner;

public class Asgn4P5ArmStrongNumber {
	static void armStrongNumber(int receivedNumber)
	{
		int sum = 0;
		int remainder = 0;
		int originalNumber = receivedNumber;
		while (receivedNumber>0)
		{ 
		remainder = receivedNumber%10;
		receivedNumber = receivedNumber/10;
		//System.out.println("remainder is " +remainder);
		//System.out.println("receivedNumber is " + receivedNumber);
		sum = sum+(remainder*remainder*remainder);
		}
		 
		if (sum==originalNumber)
		{
			System.out.println("Number is armstrong");
		}
		else System.out.println("Number is not armstrong");
		
		
		
	}
		

	public static void main(String[] args) 
	
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Provide number");
		int number = sc.nextInt();
		armStrongNumber(number);
	}

}
