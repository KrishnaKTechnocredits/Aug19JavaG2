package SiddhiB;

import java.util.Scanner;

public class ReverseFullStringAndIndividualWords {
	static void reverseStringAndWords(String receivedStr) {
		String skipSpaces = receivedStr.replaceAll(" ", "");
		for (int i = skipSpaces.length() - 1; i >= 0; i--) {
			System.out.print(skipSpaces.charAt(i));
		}
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");
		String str = sc.nextLine();
		reverseStringAndWords(str);

	}

}
