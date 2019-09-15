//WAP to print sum of digit(Consider Input as Integer not as String) 
package AmitaR;

import java.util.Scanner;

public class SumOfDigits 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to print sum of digits");
		int num=sc.nextInt();
		
		int sum=0;
		while(num>0)
		{
			int r=num%10;
			sum=sum+r;
			num=num/10;
		}
		System.out.println("The sum of digits of the number is : "+sum);
	}

}
