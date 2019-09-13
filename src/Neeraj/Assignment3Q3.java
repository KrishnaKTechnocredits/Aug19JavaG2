package Neeraj;

import java.util.Scanner;

public class Assignment3Q3 {
	static int userDefinedString(String words, char ch) {
		int count = 0;

		for (int i = 0; i < words.length(); i++) {
			if (words.charAt(i) == ch) {
				count++;
			}
		}
		return count;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the words you wanna use");
		String words = sc.nextLine();
		sc.close();
		char ch = 'e';
		System.out.println("Number of frequency of" + " " + ch + " " + "is" + " " + userDefinedString(words, ch));
	}

}
