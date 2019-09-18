package SiddhiBPatternPrograms;

import java.util.Scanner;

public class PatternProgram10 {

	void display(int rows) {
			for (int i = 1; i <= rows; i++) {
				for (int j = rows; j > i; j--) {
					System.out.print(" ");
				}
				System.out.print("*");
				for (int k = 1; k < 2 * (i - 1); k++) {
					System.out.print(" ");
				}
				if (i == 1) {
					System.out.println("");
				} else {
					System.out.println("*");
				}
			}
			for (int i = rows - 1; i >= 1; i--) {
				for (int j = rows; j > i; j--) {
					System.out.print(" ");
				}
				System.out.print("*");
				for (int k = 1; k < 2 * (i - 1); k++) {
					System.out.print(" ");
				}
				if (i == 1)
					System.out.println("");
				else
					System.out.println("*");
			}

		}

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter number of rows: ");

			int rows = sc.nextInt();

			sc.close();
			new PatternProgram10().display(rows);
		}

	}