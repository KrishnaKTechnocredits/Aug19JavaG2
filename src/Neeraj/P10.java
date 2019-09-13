package Neeraj;

import java.util.Scanner;

public class P10 {

	String alphabates = "";
	String numeric = "";

	void sepDigitNumber(String line) {

		for (int i = 0; i < line.length(); i++) {
			char a = line.charAt(i);
			if (Character.isDigit(a))

			{
				numeric += a;

			} else {
				alphabates += a;
			}
		}
		System.out.print("Alphabates in the User Input:" + " " + alphabates + " " + "and numbers in User Input:" + " "
				+ numeric);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Line to be separated");
		String line = sc.nextLine();
		sc.close();
		new P10().sepDigitNumber(line);
	}

}
