//3)	WAP to find frequency of user defined character in user defined String
package AmitaR;

import java.util.Scanner;

public class Q3FrequencyOfChar
{
	static void findCharFreq(String str, char c)
	{	
		int x = str.length();
		str = str.toLowerCase().replaceAll(str.valueOf(c),"");
		int y = str.length();
		System.out.println("The occurence of "+ c +"  is " + (x-y));			
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String input = sc.nextLine();
		System.out.println("Enter the char value");
		char ch = sc.next().charAt(0);

		findCharFreq(input, ch);

	}

}
