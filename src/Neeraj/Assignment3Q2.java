package Neeraj;

public class Assignment3Q2 {
	int maxLength = 0;
	String templine = "";

	String maxLength(String[] line) {
		for (int i = 0; i < line.length; i++) {
			if (maxLength < line[i].length()) {
				maxLength = line[i].length();
				templine = line[i];
			}
		}
		return templine;

	}

	public static void main(String[] args) {
		String[] line = { "all the best", "technocredits", "", "maharashtra" };
		System.out.println(new Assignment3Q2().maxLength(line));

	}

}
