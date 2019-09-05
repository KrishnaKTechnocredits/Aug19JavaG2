package Neeraj;

import java.util.Scanner;

public class Assignment3Q7 {
	int multiplication = 1;

	void fibonacci(int number) {

		for (int i = 5; i > 0; i--) {
			multiplication = multiplication * i;
		}

		System.out.println(multiplication);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first element of fibonacci");
		int number = sc.nextInt();
		sc.close();
		new Assignment3Q7().fibonacci(number);

	}

}
