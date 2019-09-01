// WAP to print even number from the array
package Neeraj;

class Assignment2Q14 {
	static void evenNum(int[] number) {
		for (int i = 0; i < number.length; i++) {
			if (number[i] % 2 == 0) {
				System.out.println("Even number is:" + number[i]);
			}
		}
	}

	public static void main(String[] args) {
		int[] number = { 15, 24, 52, 49, 62, 10, 17, 40 };
		evenNum(number);
	}
}