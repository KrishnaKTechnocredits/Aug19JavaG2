package Neeraj;

import java.util.Scanner;

public class Assignment3Q8 {
	int count = 0;

	int vowelCount(String input) {

		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o'
					|| input.charAt(i) == 'u') {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String line = sc.nextLine();
		sc.close();

		System.out.println(new Assignment3Q8().vowelCount(line));
	}
}
