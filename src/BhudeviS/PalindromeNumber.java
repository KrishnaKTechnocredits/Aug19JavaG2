package BhudeviS;

public class PalindromeNumber {

	public static void PalindromeNumber(String num) {
		String act = num;
		String rev = "";

		for (int i = act.length() - 1; i >= 0; i--) {
			char ch = act.charAt(i);
			rev = rev + ch;
		}
		// System.out.println(rev);

		if (num.equals(rev))
			System.out.println("Number is palindrome");
		else
			System.out.println("Number is not palindrome");
	}

	public static void main(String[] args) {
		PalindromeNumber pd = new PalindromeNumber();
		pd.PalindromeNumber("12321");

	}

}
