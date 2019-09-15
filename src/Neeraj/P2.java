package Neeraj;

import java.util.Scanner;

public class P2 {
	void display(int row) {
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numnber of rows for which you want to create a pattern");
		int row = sc.nextInt();
		sc.close();
		new P2().display(row);
	}
}
