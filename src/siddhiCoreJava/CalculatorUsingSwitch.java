package siddhiCoreJava;

import java.util.Scanner;

public class CalculatorUsingSwitch 
{

	public static void main(String[] args)
	
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number");
		int firstNumber = sc.nextInt();
		
		System.out.println("enter second number");
		int secondNumber = sc.nextInt();
		
		System.out.println("Addition-a: Subtraction-s: Multiplication-m: Division-d: ");
		char operation = sc.next().charAt(0);
	
		
		switch (operation)
		{
		case 'a':
			System.out.println("sum is " + (firstNumber+secondNumber));
			break;
		case 's':
			System.out.println("subtraction is " + (firstNumber-secondNumber));
			break;
		case 'm': 
			System.out.println("multiplication is " + (firstNumber*secondNumber));
			break;
		case 'd':
			System.out.println("devision is " + (firstNumber/secondNumber));
			break;
			
		
		}		

	}

}
