package ShivaniG;

//WAP to find given string is palidrome or not
import java.util.Scanner;

public class Asg4ques11 {
	static void palindrome(String input) {
		String rev = "";
		int len = input.length();
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + input.charAt(i);
		}
		if (input.equals(rev)) {
			System.out.println("The string is a palindrome.");
			System.out.println("Reverse string is : " + rev);
		} else
			System.out.println("The string isn't a palindrome.");

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string : ");
		String input = sc.nextLine();
		palindrome(input);
		sc.close();
	}
}
