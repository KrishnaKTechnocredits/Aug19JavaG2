/*
 * WAP to print unique number from 2 different array
 */

package Shubhangi.assignment_2;

import java.util.Scanner;

public class Program_11 {

	static int index =0;
	
	int[] getUniqueArray(int num1[], int num2[])
	{
		int[] outArray = new int[num1.length+num2.length];
		
		for(int i=0;i<num1.length;i++)
		{
			boolean flag = false;
			for(int j=0;j<index;j++)
			{
				if(num1[i] == outArray[j])
				{
					flag = true;
					break;
				}
			}
			if(flag == false)
			{
				outArray[index] = num1[i];
				index++;

			}
		}
		
		for(int i=0;i<num2.length;i++)
		{
			boolean flag = false;
			for(int j=0;j<outArray.length;j++)
			{
				if(num2[i] == outArray[j])
				{
					flag = true;
					break;
				}
			}
			if(flag == false)
			{
				outArray[index] = num2[i];
				index++;
			}
		}
		
		return outArray;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of 1st array");
		int length1 = sc.nextInt();
		
		int[] arr1 = new int[length1];
		
		System.out.println("Enter elements of 1st array");
		for(int i =0; i< length1; i++) {
			int userInput  = sc.nextInt();
			arr1[i] = userInput;
		}
		
		System.out.println("Enter length of 2nd array");
		int length2 = sc.nextInt();
		
		int[] arr2 = new int[length2];
		
		System.out.println("Enter elements of 2nd array");
		for(int i =0; i< length2; i++) {
			int userInput  = sc.nextInt();
			arr2[i] = userInput;
		}
		
		Program_11  p11 = new Program_11 ();
		
		
        int[] x =  p11.getUniqueArray(arr1, arr2);
		
		for(int i=0;i<index;i++)
		{
			System.out.println("Unique numbers in array is :"+x[i]);
		}
	}
	
}
