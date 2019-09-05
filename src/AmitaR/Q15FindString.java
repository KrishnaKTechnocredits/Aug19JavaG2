/*15)	WAP to find string which has length more than 7 characheter.
a.	Input array ={“krishna”, “maulik”, “aakash”, “harsh”, “aakansha”, ”abhishek”}\
b.	Output :- Krishna, aakansha, abhishek*/

package AmitaR;

import java.util.Scanner;

public class Q15FindString
{
	static void findString(String[] str)
	{
		String longString=null;
		System.out.println("The string which has more than 7 chars are");
		for(int i=0;i<str.length;i++)
		{
			if(str[i].length()>7)
			{
				longString=str[i];
				System.out.println(longString);				
			}			
		}		
	}
	public static void main(String[] args) {
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
		findString(arr);
	}
}
