//8) separate digits and characters from the user define string. 
package AmitaR;

import java.util.Scanner;

public class SeparateDigitnChars
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String to separate digit and characters ");
		String str=sc.next();
		
		String s1=" ";
		String number=" ";
		for(int i=0; i<str.length(); i++)
		{
			char c=str.charAt(i);
			if(Character.isDigit(c))
			{
				s1=s1+c;
			}
			else
			{
				number=number+c;
			}
		}
		System.out.println("the numbers are  "+ s1 );
		System.out.println("the digits are  "+number);
	}

}
