//4. Write a Java Program and create Calculator using switch statement

package AmitaR;

import java.util.Scanner;

public class Q4CalculatorSwitch 
{
	void calculator(double num1, double num2, char ch)
	{
		double result = 0;
		switch (ch)
		{
		case '+':
			result = num1 + num2;
			System.out.println("The addition of two no is :" + result);
			break;
		case '-':
			result = num1 - num2;
			System.out.println("The Substraction of two no is :" + result);
			break;
		case '*':
			result = num1 * num2;
			System.out.println("The Multiplication of two no is :" + result);
			break;
		case '/':
			result = num1 / num2;
			System.out.println("The Division of two no is :" + result);
			break;
		default:
			System.out.println("You have entered wrong operator");

		}
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		double firstInt = sc.nextDouble();
		double secondInt = sc.nextDouble();

		System.out.println("Enter the operation you want to perform(+,-,*,/) :");
		char operator = sc.next().charAt(0);

		Q4CalculatorSwitch cs = new Q4CalculatorSwitch();
		cs.calculator(firstInt, secondInt, operator);

	}

}
