package ShivaniG;

import java.util.Scanner;

//WAP to find frequency of user defined character in user defined String
public class Asg3ques3 {
	void charFreq(String input, char ch) {
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == ch) {
				count++;
			}
		}
		System.out.println(ch + " : " + count);
	}

	public static void main(String[] args) {
		Asg3ques3 allCharFreq = new Asg3ques3();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string : ");
		String input = sc.nextLine();
		System.out.println("Enter character : ");
		char ch = sc.next().charAt(0);
		allCharFreq.charFreq(input, ch);
		sc.close();
	}
}
