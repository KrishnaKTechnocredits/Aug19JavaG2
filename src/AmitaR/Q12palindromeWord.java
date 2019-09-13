/*12)	WAP to find word is palindrome or not ?
a.	String name = “naman”
i.	Naman is palindrome
b.	String name = “harsh”
i.	Harsh is not palindrome*/

package AmitaR;

import java.util.Scanner;

public class Q12palindromeWord
{
	static void palindromeString(String sr)
	{
		String name="";
		for(int i=sr.length()-1;i>=0;i--)
		{
			name=name+sr.charAt(i);
		}
		System.out.println("reverse of the string is : "+name);
		if(sr.equals(name))
		{
			System.out.println(name+"  is palindrome");
		}
		else
		{
			System.out.println(name+" is not palindrome");
		}
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.next();
		
		palindromeString(str);
	}

}
