package Neeraj;

public class Assignment3Q15 {
	void maxLengthString(String[] string) {
		for (int i = 0; i < string.length; i++) {
			if (string[i].length() >= 7) {
				System.out.println(string[i]);
			}
		}

	}

	public static void main(String[] args) {
		String[] string = { "krishna", "maulik", "aakash", "harsh", "aakansha", "abhishek" };
		new Assignment3Q15().maxLengthString(string);

	}

}
