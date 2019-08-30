package assignment_2;

//Find duplicate number on Integer array in Java
public class Ass2ques2 {
	void printRepeating(int arr[], int n) {
		int i, j;
		System.out.println("Repeated Elements are :");
		for (i = 0; i < n; i++) {
			for (j = i + 1; j < n; j++) {
				if (arr[i] == arr[j])
					System.out.print(arr[i] + " ");
			}
		}
	}

	public static void main(String[] args) {
		Ass2ques2 repeat = new Ass2ques2();
		int input[] = { 0, 3, 1, 2, 3 };
		repeat.printRepeating(input, input.length);
	}
}
