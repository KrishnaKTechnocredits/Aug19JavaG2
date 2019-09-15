/*3) WAP to print Fibonacci series up to user required. 
Example:-  Hint :-  1) Int num1 = 0, int num2 = 1  input :- 7  output: - 0 1 1 2 3 5 8*/ 
package AmitaR;

import java.util.Scanner;

public class FibonacciUserGivenNo
{
	public static void main(String[] args)
	{
		int n1=0,n2=1,n3 = 0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to display Fibonacci series ");
		int number=sc.nextInt();
		System.out.print(n1+ "  "+n2);
		for(int i=2;  i<=number-1; i++)
		{
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
	}

}
