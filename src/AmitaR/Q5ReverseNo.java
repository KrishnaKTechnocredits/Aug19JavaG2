/*5)	WAP to reveres user given number
a.	Input number:- 456789
b.	Output number :- 987654*/
package AmitaR;

import java.util.Scanner;

public class Q5ReverseNo
{
	static void reverseNumber(int num)
	{
		int sum=0,r=0;
		while(num>0)
		{
			int n = num % 10;
            r = r * 10 + n;
            num=num / 10;
		}
		System.out.println("The reverse of the number is : "+r);
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the no : ");
		int number = sc.nextInt();
		reverseNumber(number);

	}

}
