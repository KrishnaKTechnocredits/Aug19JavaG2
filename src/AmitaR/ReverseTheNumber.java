/*4) WAP to revers number (Consider Input as Integer not as String). 
Example:-  input:- 12345  output:- 54321*/ 

package AmitaR;

import java.util.Scanner;

public class ReverseTheNumber
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the no you want to reverse : ");
		int num = sc.nextInt();
		int sum=0,r=0;
		while(num>0)
		{
			int n = num % 10;
            r = r * 10 + n;
            num=num / 10;
		}
		System.out.println("The reverse of the number is : "+r);

	}

}


