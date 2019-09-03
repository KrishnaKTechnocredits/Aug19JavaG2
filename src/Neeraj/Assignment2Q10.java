//Find max value at differed index 
package Neeraj;

class Assignment2Q10 {
	static void maxValue(int[] number1, int[] number2) {
		for (int i = 0; i < number1.length; i++) {
			if (number1[i] == number2[i]) {
				System.out.println("Values are matched on same index");

			} else if (number1[i] < number2[i]) {

				System.out.println(number2[i]);

			} else {
				System.out.println(number1[i]);

			}

		}
	}

	public static void main(String[] args) {
		int[] number1 = { 10, 2, 19, 14, 3 };
		int[] number2 = { 10, 2, 18, 14, 3 };
		maxValue(number1, number2);
	}

}