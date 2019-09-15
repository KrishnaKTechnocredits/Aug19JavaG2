package ShivaniG;

import java.util.Scanner;

public class Pattern7 {
	static void pattern(int num) {
		for (int i = 0; i < num; i++) // outer loop for number of rows(n)
		{
			for (int j = num - i; j > 1; j--) { // printing spaces
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) // inner loop for number of columns
			{
				System.out.print("*"); // print star
			}

			System.out.println(); // ending line after each row
		}
		for (int i = num - 1; i >= 0; i--) // outer loop for number of rows(n)
		{
			for (int j = num - i; j > 1; j--) { // printing spaces
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) // inner loop for number of columns
			{
				System.out.print("*"); // print star
			}

			System.out.println(); // ending line after each row
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number for pattern : ");
		int num = sc.nextInt();
		pattern(num);
		sc.close();
	}

}
