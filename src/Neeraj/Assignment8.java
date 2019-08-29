// You are given a string S, which comprises English alphabets, determine the count of all the vowels in S. Vowels are [a,e,i,o,u]. Print the count of all the vowels that are available in the string S
package Neeraj;

class Assignment8 {
	int count = 0;

	int vowelscount(String line) {

		for (int j = 0; j < line.length(); j++)

		{
			if (line.charAt(j) == 'a' || line.charAt(j) == 'e' || line.charAt(j) == 'i' || line.charAt(j) == 'o'
					|| line.charAt(j) == 'u') {
				count++;
			}

		}
		return count;

	}

	public static void main(String[] args) {
		System.out.println("Number of Vowels available in:"
				+ new Assignment8().vowelscount("Love the way lie or lie the way you love"));

	}
}