package BhudeviS;

public class PalindromeWord {

	public static void Palindromeword(String name) {
		String act = name;
		String rev = "";

		for (int i = act.length() - 1; i >= 0; i--) {
			char ch = act.charAt(i);
			rev = rev + ch;
		}
		// System.out.println(rev);

		if (name.equals(rev))
			System.out.println("Word is palindrome");
		else
			System.out.println("Word is not palindrome");
	}

	public static void main(String[] args) {
		PalindromeWord pd = new PalindromeWord();
		pd.Palindromeword("naman");

	}

}
