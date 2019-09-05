package Neeraj;

public class Assignment3Q11 {

	static void findNumberIsPalindrome(int receivedNumber) {
		int reverseNumber = 0;
		int originalNumber = receivedNumber;
		while (receivedNumber > 0) {
			reverseNumber = reverseNumber * 10 + receivedNumber % 10;
			receivedNumber = receivedNumber / 10;
		}
		System.out.println("reverse number is :" + reverseNumber);

		if (reverseNumber == originalNumber) {
			System.out.println("number is palindrome ");
		} else
			System.out.println("number is not palindrome");
	}

	public static void main(String[] args) {
		int InputNumber = 12321;
		findNumberIsPalindrome(InputNumber);

	}

}
