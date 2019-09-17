package ShivaniG;

//WAP to reverse a full String and particular word also.
import java.util.Scanner;

public class Asg4ques2 {
	static void reverse(String original, int length) {
		String reverse = "";
		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse + original.charAt(i);
		}
		System.out.println("Reverse of the string: " + reverse);
	}

	public static void main(String[] args) {
		String original;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string to reverse");
		original = in.nextLine();
		int length = original.length();
		reverse(original, length);
		in.close();
	}

}
