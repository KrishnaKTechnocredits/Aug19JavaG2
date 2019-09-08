package Neeraj;

import java.util.Scanner;

public class MyProg2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of row");
		int row = sc.nextInt();
		sc.close();

		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				int v = 0;
				if (j == 1) {
					System.out.print(i + " ");
				} else {
					v = i + (j - 1) * 2;
					System.out.print(v + " ");
				}
			}
			System.out.println();
		}
	}
}
