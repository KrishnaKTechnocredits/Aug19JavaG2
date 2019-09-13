/*6)	WAP to find reverse max length string 
a.	Input array:- {“all the best”, “technocredits”, “”, “maharashtra”}
b.	Output Max length string :- Technocredits
c.	Max length string reverse value :- stiderconhcet*/

package AmitaR;

import java.util.Scanner;

public class Q6ReverseMaxLengthString 
{
	static void findReverseOfMaxString(String[] str)
	{
		int maxLength=0;
		String longString=null;
		for(int i=0;i<str.length;i++)
		{
			if(str[i].length()>maxLength)
			{
				maxLength=str[i].length();
				longString=str[i];
			}
		}
		System.out.println("The longest string is : " + longString);

		char[] ch=longString.toCharArray();
		for(int i=longString.length();i>0;i--)
		{
			System.out.print("Max length string reverse value is : " + ch[i-1]);
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array of size");
		int size=sc.nextInt();
		System.out.println(size);
		String[] arr=new String[size];
		
		System.out.print("Enter the strings : " );
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.next();
		}
		
		findReverseOfMaxString(arr);
		
	}

}
