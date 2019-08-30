package assignment_2;

//Largest and smallest number in unsorted array
public class Ass2ques4 {
	void maxmin(int input[], int n) {
		int max = input[0];
		int min = input[0];
		for (int i = 1; i < n; i++) {
			if (input[i] > max) {
				max = input[i];
			} else if (input[i] < min) {
				min = input[i];
			}
		}
		System.out.println("Largest number : " + max);
		System.out.println("Smallest number : " + min);
	}

	public static void main(String[] args) {
		Ass2ques4 check = new Ass2ques4();
		int input[] = { 2, 6, 3, 9, 11 };
		check.maxmin(input, input.length);
	}
}
