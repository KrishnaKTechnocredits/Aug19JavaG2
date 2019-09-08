package ShivaniG;

//Find the missing number in integer array of 1 to 10
public class Ass2ques1 {
	void findmissing(int input[], int n) {
		int i, total;
		total = (n + 1) * (n + 2) / 2; //calculating difference
		for (i = 0; i < n; i++) {
			total = total - input[i];
		}
		System.out.print("Missing number is : " + total);
	}

	public static void main(String[] args) {
		Ass2ques1 missing = new Ass2ques1();
		int input[] = { 1, 2, 3, 4, 5, 6, 8, 9, 10 };
		missing.findmissing(input, input.length);
	}
}
