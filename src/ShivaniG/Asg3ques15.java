package ShivaniG;

//WAP to find string which has length more than 7 characheter
public class Asg3ques15 {
	static String maxName; // blank
    void findSevenLegth(String input[]) {
		for (int i = 0; i < input.length; i++) {
			if (input[i].length() >= 7) {
				//maxlength = input[i].length();
				maxName = input[i];
				System.out.println("Output is : " + maxName);
			}
		}
	}

	public static void main(String[] args) {
		Asg3ques15 maxCharFreq = new Asg3ques15();
		String input[] = { "krishna","maulik", "aakash", "harsh", "aakansha", "abhishek"};
		maxCharFreq.findSevenLegth(input);
	}
}
