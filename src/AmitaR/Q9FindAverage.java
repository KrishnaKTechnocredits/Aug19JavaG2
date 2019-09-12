/*9)	WAP to find average of user given array
a.	Input :- {14, 32, 19, 14, 78,36}
b.	Output:- 32.16*/

package AmitaR;

import java.util.Scanner;

public class Q9FindAverage
{
	static void findAverageOfArray(int[] number)
			{
				double average=0.0;
				int sum=0;
				for(int i=0;i<number.length;i++)
				{
					sum=sum+number[i];		
				}
				average=sum/number.length;
				System.out.println("The average of the array is:  " +average );
			}	
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no of elements of the array:");
        int num = sc.nextInt();
        int a[] = new int[num];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < num ; i++)
        {
            a[i] = sc.nextInt();
        }   
        findAverageOfArray(a);
	}

}
