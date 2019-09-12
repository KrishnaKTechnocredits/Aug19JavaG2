package ShivaniG;

public class Asg3ques6 {
	static int maxlength; // 0
	static String maxName; // blank

	String findMaxLegth(String input[]) {
		maxlength = input[0].length(); // assigning default value
		for (int i = 0; i < input.length; i++) {
			if (input[i].length() > maxlength) {
				maxlength = input[i].length();
				maxName = input[i];
			}
		}
		return maxName;
	}

	static void reverse(String maxName) {
		String rev = "";
		int len = maxName.length();
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + maxName.charAt(i);
		}
		System.out.println("Reverse string is : " + rev);
	}

	public static void main(String[] args) {
		Asg3ques6 maxCharFreq = new Asg3ques6();
		String input[] = { "all the best", "technocredits", " ", "maharashtra" };
		String maxName = maxCharFreq.findMaxLegth(input);
		System.out.println("Maximum length name is " + maxName);
		reverse(maxName);
	}
}
