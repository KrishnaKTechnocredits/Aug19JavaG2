/*a.	WAP to find positive and negative number from the given array  
b.	check the sum of individual.
*/

package AmitaR;

import java.util.Scanner;

public class Q1FindPosnNeg 
{
	public static void sumArray(int[] input)
	{
		int positiveSum = 0;
		int negativeSum = 0;
		System.out.print("the positive numbers are :");
		for (int i = 0; i < input.length; i++) 
		{   
			if (input[i] > 0) 
			 	{   
				System.out.print(input[i]+ " ");
				positiveSum = positiveSum + input[i];
			 	}
		}
		System.out.print("the negative numbers are :");
		for (int i = 0; i < input.length; i++)
		{
			if (input[i] < 0 && input[i] != 0)
			{
				System.out.print(input[i]+ " ");
				negativeSum = negativeSum + input[i];
			}
		}
		System.out.println("Positive nos sum  : " + positiveSum);
		System.out.println("Negative nos sum : " + negativeSum);
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the no of elements in an array:  ");
		int size = sc.nextInt();

		int num[] = new int[size];
		System.out.print("Please enter  " + size + "  elements of an array: ");

		for (int i = 0; i < num.length; i++)
		{
			num[i] = sc.nextInt();
		}
		sumArray(num);
	}
}
