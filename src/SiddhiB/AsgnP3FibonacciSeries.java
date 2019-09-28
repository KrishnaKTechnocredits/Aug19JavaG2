package SiddhiB;
import java.util.Scanner;

public class AsgnP3FibonacciSeries 
{	static void fibonacciSeries (int  n)
	{
	 
	int sum = 0;
	int num1 = 0;
	int num2 = 1;
	
	for (int i = 0;i<=n;i++)
	{
		if (i<2)
		{
		System.out.println(i);
		//System.out.println(num2);
		}
	
		sum = num1+num2;
		System.out.println(sum);
	
		num1 = num2;
		num2 = sum;
	}
	}
	    
	
	
	public static void main(String[] args) 
	
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int number = sc.nextInt();
		fibonacciSeries(number);
		
		
	}

}
