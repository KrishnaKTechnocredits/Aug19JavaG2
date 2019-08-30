package ShivaniG;
//WAP to print the sum of all elements of an array of size 4
class Sum_Q2 {
	static int arr[] = { 12, 3, 4, 15 };
	static int sum() {
		int sum = 0;
		int i;
		for (i = 0; i < 4; i++) {
			sum += arr[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println("Sum of given array is " + sum());
	}
}
