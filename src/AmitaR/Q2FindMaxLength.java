/*2)	WAP to find max length String from the given array.
a.	Input array:- {“all the best”, “technocredits”, “”, “maharashtra”}
*/

package AmitaR;

import java.util.Scanner;

public class Q2FindMaxLength
{
		public static void maxLengthString(String[] str)
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
		}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the no of words : ");
		int size=sc.nextInt();
		System.out.println(size);
		String[] arr=new String[size];
		
		System.out.print("Enter the words : " );
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.next();
		}
		maxLengthString(arr);		
	}

}


