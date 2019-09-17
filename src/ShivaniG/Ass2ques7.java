package ShivaniG;

//Find all pairs on integer array whose sum is equal to given number
public class Ass2ques7 {
	void sum(int input[], int num) {
		for (int i = 0; i < input.length; i++) {
			for (int j = i + 1; j < input.length; j++) {
				if (input[i] + input[j] == num) {
					System.out.print("Sum of " + input[i] + " and " + input[j] + " is equal to " + num + " ");
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		Ass2ques7 check = new Ass2ques7();
		int input[] = { 2, 4, 3, 5, 7, 8, 9 };
		int num = 7;
		check.sum(input, num);
	}
}
