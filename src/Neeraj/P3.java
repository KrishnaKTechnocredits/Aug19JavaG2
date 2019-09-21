package Neeraj;
import java.util.Scanner;
public class P3 {
	void pattern3(int row) {
		for (int i = 1; i <= row; i++) {
			for (int j = row; j >= 1; j--) {
				if (j > i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row count for which you want to create pattern");
		int row = sc.nextInt();
		sc.close();
		new P3().pattern3(row);
	}
}
