// Find all pairs on integer array whose sum is equal to given number?
package Neeraj;

class Assignment2Q7 {
	static void pairSum(int[] number, int sum)

	{
		for (int i = 0; i < number.length; i++) {
			for (int j = i + 1; j < number.length; j++) {

				if ((number[i] + number[j]) == sum) {
					System.out.println(number[i] + " " + number[j]);
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] number = { 2, 4, 3, 5, 7, 8, 9 };
		pairSum(number, 7);
	}
}