//Check if array contains a number in Java?
package Neeraj;

class Assignment2Q3 {
	static void arrayContainsnumber(int[] number, int a) {
		boolean b = true;
		for (int i = 0; i < number.length; i++) {
			if (number[i] == a) {
				b = false;
				System.out.println("Number contains in Array");
				break;

			}

		}
		if (b == true) {
			System.out.println("Number doesn't contain in Array");
		}
	}

	public static void main(String[] args) {
		int[] number = { 2, 5, 9, 7, 4, 6 };
		arrayContainsnumber(number, 13);
	}
}