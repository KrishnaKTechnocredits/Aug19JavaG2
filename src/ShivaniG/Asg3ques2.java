package ShivaniG;

//WAP to find max length String from the given array.
public class Asg3ques2 {
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

	public static void main(String[] args) {
		Asg3ques2 maxCharFreq = new Asg3ques2();
		String input[] = { "all the best", "technocredits", " ", "maharashtra" };
		String maxName = maxCharFreq.findMaxLegth(input);
		System.out.println("Maximum length name is " + maxName);
	}
}
