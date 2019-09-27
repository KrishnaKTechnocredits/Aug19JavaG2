//1. Find the largest of three numbers using Logical And operator.

package AmitaR;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q1LargestOfThreeNumbers
{
	void findLarge(int num[])
	{
		if (num[0] > num[1] && num[1] > num[2])
		{
			System.out.println("The largest number is " + num[0]);
		} else if (num[1] > num[2]) {
			System.out.println("The largest number is " + num[1]);
		} else {
			System.out.println("The largest number is " + num[2]);
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int[] num = new int[3];
		while (count < 3) {
			System.out.println("Enter number " + (count + 1));
			try 
			{
				int number = Integer.parseInt(sc.next());
				num[count] = number;
				count++;
			} catch (InputMismatchException ie)
			{
				System.out.println("Please enter valid number");
			} catch (NumberFormatException ne) 
			{
				System.out.println("Please enter valid number");
			}
		}
		Q1LargestOfThreeNumbers lg = new Q1LargestOfThreeNumbers();
		lg.findLarge(num);
	}

}
