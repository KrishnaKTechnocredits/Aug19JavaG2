package BhudeviS;

public class FindFrequencyOfCharacter {

	public static void main(String[] args) {

		String str = "electrical engineering";

		// char value e
		// count of e 5
		char c = 'e';

		char[] ch = str.toCharArray();
		int count = 0;
		for (int i = 0; i < ch.length; i++) 
		{
			if (ch[i] == 'e')
				count++;
		}
		System.out.println("Frequency of character e is:"+count);
	}
}
