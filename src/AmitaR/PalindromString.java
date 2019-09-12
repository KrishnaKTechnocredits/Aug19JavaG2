//11) WAP to find given string is palidrome or not 
package AmitaR;

import java.util.Scanner;

public class PalindromString
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.next();
		String name="";
		for(int i=str.length()-1;i>=0;i--)
		{
			name=name+str.charAt(i);
		}
		System.out.println("reverse of the string is : "+name);
				
		if(str.equals(name))
			{
				System.out.println(str+"  is palindrome");
			}
		else
			{
				System.out.println(str+" is not palindrome");
			}
		}
}
