/*7)	WAP to find Fibonacci series for user defined number
a.	Input number :- 5
b.	Output :- 120*/

package AmitaR;

import java.util.Scanner;

public class Q7Factorial 
{
	static void findFactorial(int num)
	{
		long factorial=1;
		for(int i=1;i<=num;i++)
		{
			factorial=factorial*i;
		}
		System.out.println("The factorial of "+ num + "  is  " + factorial);
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the no : ");
		int number = sc.nextInt();
		
		findFactorial(number);

	}

}
