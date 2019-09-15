//5) WAP to check if a number is Armstrong or not 
package AmitaR;

import java.util.Scanner;

public class AmstrongNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check if the number is Armstrong no or not");
		int number=sc.nextInt();
		
		int num,  a=0;
		int amstrong=number;
		while(number>0)
		{
			num=number%10;
			number=number/10;
			a=a+(num*num*num);
		}
		if(amstrong==a)
		{
			System.out.println(amstrong + "  is an Armstrong Number");
		}
		else
		{
			System.out.println(amstrong + "  is not an armstrong Number");
		}

	}

}
