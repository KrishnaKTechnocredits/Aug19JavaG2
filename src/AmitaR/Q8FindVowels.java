/*8)	WAP to find vowels in given string 
a.	Input :- automation engineering
b.	Count :- 11
*/
package AmitaR;

import java.util.Scanner;

public class Q8FindVowels
{
	static void findVowelInstring(String s)
	{
		int count=0;
		int x = s.length();
		s = s.replaceAll("a", "").replaceAll("A", "").replaceAll("e", "").replaceAll("E", "").replaceAll("i", "").replaceAll("I", "").replaceAll("o", "").replaceAll("O", "").replaceAll("u", "").replaceAll("U", "");
		int y=s.length();
		System.out.println(x-y);
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the string : ");
		String str=sc.nextLine();
		
		findVowelInstring(str);
	}

}
