//WAP to print the sum of all the elements of an array of size N where N can be any integer between 1 and 100. 1≤N≤100 

package Neeraj;

class Assignment3 {
	int sum = 0;

	int display(int[] n)

	{
		for (int i = 0; i < n.length; i++) {
			if (n[i] >= 1 && n[i] <= 100) {
				sum = sum + n[i];

			} else {
				System.out.println("Out of range");
				break;

			}

		}
		return sum;

	}

	public static void main(String[] args) {
		int[] n = { 30, 60, 10 };

		System.out.println("The Sum of Array Element:" + (new Assignment3().display(n)));
	}
}