package Neeraj;

import java.util.Scanner;

public class Assignment3Q4 {
	int sum=0;
	 void sumUserInput(int[] input)
	{
		
		for(int i=0; i<input.length;i++)
		{
			sum+=input[i];
			
		}
		System.out.println(sum);
		
	}
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integer String");
		//int size= sc.nextInt();
		
		int[] number=new int[5];
		//sc.close();
		for(int i=0; i<number.length;i++)
			
		{
			System.out.println("Please Enter the Number:"+ (i+1)+ ":");
			number[i]=sc.nextInt();
		}
		sc.close();
		new Assignment3Q4().sumUserInput(number);
		
		
	}

}
