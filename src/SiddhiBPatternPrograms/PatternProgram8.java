package SiddhiBPatternPrograms;

import java.util.Scanner;

public class PatternProgram8 {

		void display(int row) {

			for (int i = 1; i <= row; i++) {
				for (int j = i; j < row; j++) {
					System.out.print(" ");
				}
				for (int k = 1; k <= i; k++) {
					System.out.print("*");
				}
				System.out.println("");
			}
			for (int i = row; i >= 1; i--) {
				for (int j = i; j <= row; j++) {
					System.out.print(" ");
				}
				for (int k = 1; k < i; k++) {
					System.out.print("*");
				}
				System.out.println("");

			}
		}

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the maxStar");
			int row = sc.nextInt();
			sc.close();
			new PatternProgram8().display(row);

		}

	}