/*
 * WAP to find unique number from given array store that numbers in new array. 
 */

package Shubhangi.assignment_3;

import java.util.Scanner;

public class Program_14 {
	
	static int index =0;
	
	int[] findUnique(int num1[], int num2[]) {
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
		System.out.println("Please enter length of array");
		int length1 = sc.nextInt();
		
		int arr1[]= new int[length1];
		
		System.out.println("Please enter array elements");
		 
		for(int i = 0; i<arr1.length; i++) {
			int userInput = sc.nextInt();
			arr1[i] = userInput ;
		}
		
		System.out.println("Please enter length of String second array");
		int length2 = sc.nextInt();
		
		int arr2[]= new int [length2];
		
		System.out.println("Please enter array elements");
		 
		for(int i = 0; i<arr2.length; i++) {
			int userInput = sc.nextInt();
			arr2[i] = userInput ;
		}
		
		
		Program_14 p1 = new Program_14();
		int[] x = p1.findUnique(arr1, arr2);
		
		System.out.println("Unique numbers in array is :");
				
		for(int i=0;i<index;i++)
		{
			System.out.println(x[i]);
		}
		
		sc.close();
		
	}
	
}
