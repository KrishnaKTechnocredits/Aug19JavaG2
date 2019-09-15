//6) WAP to print factorial number 
package AmitaR;

import java.util.Scanner;

public class FactorialNumber
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to print factorial number");
		int number=sc.nextInt();
		
		long factorial=1;
		for(int i=1;i<=number;i++)
		{
			factorial=factorial*i;
		}
		System.out.println("The factorial of "+ number + "  is  " + factorial); 	 	
	}

}
