package BhudeviS;

public class FindVowels {

	public static void main(String[] args) {

		String str = "automation engineering";
		int count = 0;
		for (int i = 0; i < str.length() - 1; i++) {

			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				count++;
			}
			count = count + 0;

		}
		System.out.println("Count of vowels in string is:"+count);
	}
}
