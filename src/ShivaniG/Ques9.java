package ShivaniG;

//WAP to count no. of occurence of all digits in the string
class Ques9 {
	void digit(String statement, char ch) {
		int count = 0;
		for (int i = 0; i < statement.length(); i++) {
			if (statement.charAt(i) == ch) {
				count++;
			}
		}
		System.out.println(ch + " : " + count);
	}

	public static void main(String[] a) {
		Ques9 ques9 = new Ques9();
		String input = "128896";
		for (int index = 0; index < input.length(); index++) {
			char currentChar = input.charAt(index);
			if (index == input.indexOf(currentChar))
				ques9.digit(input, input.charAt(index));
		}
	}
}