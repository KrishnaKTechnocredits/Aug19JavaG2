package ShivaniG;

/*	WAP which fulfill below condition
a.	WAP to find positive and negative number from the given array  
b.	check the sum of individual.
*/
public class Asg3ques1 {
	static void sum(int input[]) {
		int countneg = 0;
		int countpos = 0;
		int sumneg = 0;
		int sumpos = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i] < 0) {
				countneg++;
				System.out.println("Negative number : " + input[i]);
				sumneg = sumneg + input[i];
			} else if (input[i] > 0) {
				countpos++;
				System.out.println("Positive number : " + input[i]);
				sumpos = sumpos + input[i];
			}
		}
		System.out.println("Count of positive numbers : " + countpos);
		System.out.println("Count of negative numbers : " + countneg);
		System.out.println("Sum of positive numbers : " + sumpos);
		System.out.println("Sum of negative numbers : " + sumneg);
	}

	public static void main(String[] args) {
		int input[] = { 5, 6, -9, 14, -25, 6, 7, -14 };
		sum(input);
	}
}
