//2. Find greater of two numbers using ternary operator
package AmitaR;

import java.util.Scanner;

public class Q2GreaterOfTwoNumbers 
{
	int greaterNo;

	void greaterNumber(int a, int b) 
	{
		greaterNo = (a > b) ? a : b;
		System.out.println("The Greater no is : " + greaterNo);
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int firstInt = sc.nextInt();
		int secondInt = sc.nextInt();
		Q2GreaterOfTwoNumbers gt = new Q2GreaterOfTwoNumbers();
		gt.greaterNumber(firstInt, secondInt);
	}

}
