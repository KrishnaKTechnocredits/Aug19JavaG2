/*13)	WAP to find number is Armstrong or not.
a.	Int number = 153
i.	Number is Armstrong
b.	Int number = 234
i.	Number is not Armstrong */

package AmitaR;

import java.util.Scanner;

public class Q13ArmstrongNo
{
	static void armstrongNumber(int num)
	{
		String str=String.valueOf(num);
		int sum=0;

		for(int i=0;i<str.length();i++)
			{	
				char ch = str.charAt(i);
				String temp = String.valueOf(ch);
				int x = Integer.parseInt(temp);
				sum =sum+x*x*x;
			}
		if (sum==num)
			{
				System.out.println("Number is Armstrong");
			}
		else
			{
				System.out.println("Number is not Armstrong");
			}
	}
public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number");
        int number = sc.nextInt();
        
        armstrongNumber(number); 

	}

}
