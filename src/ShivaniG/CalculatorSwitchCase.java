package assignment_5;

import java.util.Scanner;

//WAP to create calculator using switch case

public class CalculatorSwitchCase {
	static void calculate(int x, int y, char ch) {
		switch (ch) {
		case '1':
			System.out.println("Addition: " + (x + y));
			break;
		case '2':
			System.out.println("Subtraction: " + (x - y)); // x should be larger
															// than y
			break;
		case '3':
			System.out.println("Product: " + (x * y));
			break;
		case '4':
			System.out.println("Division: " + (x / y));
			break;
		default:
			System.out.println("Wrong choice");
		}
	}

	public static void main(String[] args) {
		int x, y;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the first number:");
		x = s.nextInt();
		System.out.print("Enter the second number:");
		y = s.nextInt();
		char ch;
		System.out.println(
				"What do you want to calculate? \n 1.Addition \n 2. Subtraction \n 3. Multiplication \n 4. Division ");
		ch = s.next().charAt(0);
		calculate(x, y, ch);
		s.close();

	}

}
