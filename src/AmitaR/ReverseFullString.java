/*2) WAP to revers a full String and particular word also.
Example:-  input = “there is an apple”  output = “elppanasiereht” */
package AmitaR;

import java.util.Scanner;

public class ReverseFullString
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence");
		String str=sc.nextLine();
		System.out.println(str);
		
		String str1=str.replaceAll(" ", "");
	
		String temp="";
		for(int i=str1.length()-1; i>=0; i--)
		{
			temp=temp+str1.charAt(i);			
		}
		System.out.println(temp);
		
		/*String a[]=str.split(" ");
		for(int j=0;  j<a.length; j++)
		{
			System.out.println(a[j]);
		}*/
		
		System.out.println("enter the word you want to reverse");
		String st=sc.next();
		System.out.println(st);
		String reverseWord="";
		for(int j=st.length()-1; j>=0; j--)
		{
			reverseWord=reverseWord+st.charAt(j);
		}
		System.out.println("The reverse word is  :"+reverseWord);	
	}
}
