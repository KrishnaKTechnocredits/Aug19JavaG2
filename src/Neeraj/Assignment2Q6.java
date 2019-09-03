// Write a java program to check the equality of two arrays? 
package Neeraj;

class Assignment2Q6 {
	static void arrayEqual(int[] number1, int[] number2) {

		for (int i = 0; i < number1.length; i++) {
			boolean b = true;
			for (int j = 0; j < number2.length; j++) {

				if (number1[i] == number2[j]) {
					System.out.println("Array are Equal");
					b = false;
					break;
				}

			}
			if (b == true) {
				System.out.println("Array are not Equal");
				// break;
			}

		}

	}

	public static void main(String[] args) {
		int[] number1 = { 21, 57, 11, 37, 24 };
		int[] number2 = { 21, 58, 11, 37, 24 };
		arrayEqual(number1, number2);
	}
}