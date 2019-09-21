package Neeraj;

import java.util.Scanner;

public class P4 {
	void pattern4(int row) {
		for (int i = row; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row count for which you want to create pattern");
		int row = sc.nextInt();
		sc.close();
		new P4().pattern4(row);

	}

•ï