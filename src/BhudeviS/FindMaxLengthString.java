package BhudeviS;

public class FindMaxLengthString {

	public static void main(String[] args) {

		String[] str = { "all the best","technocredits"," ","maharashtra" };

		int maxlength = 0;
		String longstring = "";

		for (int i = 0; i <=str.length-1; i++) {
			if (str[i].length() > maxlength) {
				maxlength = str[i].length();
				longstring = str[i];
			}
		}

		System.out.println(longstring);

	}

}
