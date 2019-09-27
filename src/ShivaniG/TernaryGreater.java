package assignment_5;

import java.util.Scanner;

//WAP to find greater of two numbers using ternary operator

public class TernaryGreater {
	static void findgreater(int x, int y) {
		int greater;
		greater = (x > y) ? x : y;
		System.out.println(greater + " is greater number");
	}

	public static void main(String[] args) {
		int x, y;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the first number:");
		x = s.nextInt();
		System.out.print("Enter the second number:");
		y = s.nextInt();
		findgreater(x, y);
		s.close();

	}

}
