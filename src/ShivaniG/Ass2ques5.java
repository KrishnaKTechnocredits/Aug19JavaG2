package ShivaniG;

//Write a java program to find second largest element in an array of integers
public class Ass2ques5 {
	void large(int input[], int n) {
		int large1 = input[0];
		int large2 = input[0];
		for (int i = 0; i < n; i++) {
			if (input[i] > large1)
				large1 = input[i];
		}
		for (int i = 1; i < n; i++) {
			if (input[i] > large2 && input[i] < large1)
				large2 = input[i];
		}
	System.out.println("Largest number : "+large1);
	System.out.println("Second largest number : "+large2);
	}

	public static void main(String[] args) {
		Ass2ques5 check = new Ass2ques5();
		int input[] = { 2, 6, 3, 9, 11 };
		check.large(input, input.length);
	}
}
