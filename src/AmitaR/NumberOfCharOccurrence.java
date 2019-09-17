/*10) WAP to character occurring in user defined String and Character
Example :-  InputString :- hello how are you harsh?  
Input char :- h  Output:- char is : h and number of occurrence = 4.  */
 
package AmitaR;

import java.util.Scanner;

public class NumberOfCharOccurrence
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		System.out.println("Enter the character");
		char ch=sc.next().charAt(0);
		
		int cnt=0;
		for(int i=0; i<str.length(); i++)
		{
			if(ch==str.charAt(i))
			{
				cnt++;
			}
		}
		System.out.println("Character occurence is   "+ cnt);
	}

}
