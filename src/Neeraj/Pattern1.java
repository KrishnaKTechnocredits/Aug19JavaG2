package Neeraj;

import java.util.Scanner;

public class Pattern1 {
	void pattern1(int row) {

		for (int i = row; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= row - i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row:");
		int row = sc.nextInt();
		sc.close();
		new Pattern1().pattern1(row);
	}
}
