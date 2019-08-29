// WAP to print the sum of squares of the elements of an array of size N. N can be any integer between 1 and 100. 1≤N≤100 
package Neeraj;

class Assignment4 {
	int sum = 0;

	int square(int[] num) {
		for (int i = 0; i < num.length; i++) {
			if (num[i] >= 1 && num[i] <= 100) {
				sum = sum + num[i] * num[i];
			} else {
				System.out.println("Out of Range");
			}

		}

		return sum;
	}

	public static void main(String[] args) {
		int[] num = { 9, 8, 7, 10 };
		System.out.println("Sum of Square of an Array Element:" + (new Assignment4().square(num)));
	}
}