package ShivaniG;
//WAP to add two arrays
class Ques6 {
	public static void main(String[] args) {
		int n = 3;
		int[] numArrayA = { 3, 9, 8 };
		int[] numArrayB = { 8, 12, 74 };
		int[] sum = { 0, 0, 0 };
		for (int i = 0; i < n; i++) {
				sum[i] = numArrayA[i] + numArrayB[i];
				System.out.println("sum at position " + i + " : " +sum[i]);
		}
	}
}