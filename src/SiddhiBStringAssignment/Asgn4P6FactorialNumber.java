package SiddhiBStringAssignment;

import java.util.Scanner;

public class Asgn4P6FactorialNumber {
	static void findFactorialNumber(int receivedNumber)
	{
		int fn = 1;
		for (int i = receivedNumber;i>=1;i--)
		{
			fn= fn* i;
		}
		System.out.println("factorla number is "+ fn);
	}

	public static void main(String[] args) 
	
	{
	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number to get factorial info");
		int number = sc.nextInt();
		findFactorialNumber(number);
		
	}

}
