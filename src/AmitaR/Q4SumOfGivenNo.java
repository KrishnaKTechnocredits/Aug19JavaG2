/*4)	WAP to find sum of user given number.
a.	Input:- 159753
b.	Sum of given number:- 30
*/
package AmitaR;

import java.util.Scanner;

public class Q4SumOfGivenNo
{
	static void sumOfDigits(int num)
	{
		int sum=0;
		while(num>0)
		{
			int r=num%10;
			sum=sum+r;
			num=num/10;
		}
		System.out.println("The sum of digits of the number is : "+sum);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the no : ");
		int number = sc.nextInt();
		sumOfDigits(number);
	}

}
