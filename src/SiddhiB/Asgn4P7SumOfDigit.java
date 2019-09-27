package SiddhiB;

import java.util.Scanner;

public class Asgn4P7SumOfDigit 
{	static void sumOfDigit(int n)
	{	int sum = 0;
		
		while (n>0)
		{
			
			int rn = n%10;
			//System.out.println("remainder is" + rn);
			n = n/10;
			
			//System.out.println("nunber is" + n);	
			sum = sum+rn;
			
			
		} System.out.println("inside while sum " + sum);
		
		
	}

	public static void main(String[] args) 
	
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int number = sc.nextInt();
		sumOfDigit(number);

	}

}
