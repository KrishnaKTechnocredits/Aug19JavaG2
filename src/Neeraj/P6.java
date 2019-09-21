package Neeraj;

import java.util.Scanner;

public class P6 {
	void display(int maxStar) {
		for (int i = 1; i <= 9; i++) {
			if (i <= 5) {
				for (int j = 1; j <= i; j++) {
					System.out.print(" * ");
				}
				System.out.println();
			} else if (i <= 9 && i >= 6) {
				for (int k = i; k <= ((maxStar * 2) - 1); k++) {
					System.out.print(" * ");
				}
				System.out.println();
			}
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of max Star");
		int maxStar = sc.nextInt();
		sc.close();
		new P6().display(maxStar);

	}
}
