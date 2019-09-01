// WAP to reveres arra
package Neeraj;

class Assignment2Q13 {
	void reverseArray(int[] number) {
		for (int i = number.length - 1; i >= 0; i--) {
			System.out.print(" " + number[i]);

		}
	}

	public static void main(String[] args) {
		int[] number = { 5, 6, 9, 10, 14, 63 };
		new Assignment2Q13().reverseArray(number);
	}
}