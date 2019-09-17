/*9) WAP to revers the word. 
Example:-  input :- hello good morning to all  
output:-ollehdooggninromotlla*/
package AmitaR;

import java.util.Scanner;

public class ReverseEachWordInAString
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence");
		String str=sc.nextLine();
		System.out.println(str);
		
		String array[]=str.split(" ");
		String reverseString="";
		for(int i=0; i<array.length; i++)
		{
			String word=array[i];
			String reverseWord="";		
				for(int j=word.length()-1; j>=0; j--)
					{
						reverseWord=reverseWord+word.charAt(j);
					}
						reverseString=reverseString+reverseWord+"";
		}
		System.out.println("The reversed sentence is :"+reverseString);
	}

}
