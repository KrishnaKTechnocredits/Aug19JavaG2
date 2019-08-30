// WAP to print common number from two different array 
package Neeraj;

class Assignment2Q12 {
	static void commonNumber(int[] number1, int[] number2) {
		for (int i = 0; i < number1.length; i++) {
			for (int j = 0; j < number2.length; j++) {
				if (number1[i] == number2[j]) {
					System.out.println("Common Number is:" + number1[i]);
				}

			}
		}
	}

	public static void main(String[] args) {
		int[] number1 = { 1, 3, 6, 9, 7, 10 };
		int[] number2 = { 2, 5, 6, 9, 8, 10 };
		commonNumber(number1, number2);

	}
}