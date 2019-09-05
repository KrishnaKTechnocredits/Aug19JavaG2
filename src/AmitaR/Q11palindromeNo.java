/*11)	WAP to find to number is palindrome or not.
Note:- Palindrome means given word/number is same to read from forward and backward
i.e. actual number :- 12321*/

package AmitaR;

import java.util.Scanner;

public class Q11palindromeNo
{
	static void palindromeNumber(int num)
		{
			int sum=0,r=0,temp=num;
			while(num>0)
				{
					int n = num % 10;
					r = r * 10 + n;
					num=num / 10;
				}
			System.out.println("The reverse of the number is : "+r);
				if(r==temp)
				{
					System.out.println("The number is palindrome");
				}
				else
				{
					System.out.println("The number is not palindrome");
				}
				}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number");
        int number = sc.nextInt();
        
        palindromeNumber(number);

	}

}
