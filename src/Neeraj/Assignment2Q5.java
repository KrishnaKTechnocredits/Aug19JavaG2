//Write a java program to find second largest element in an array of integers?
package Neeraj;

class Assignment2Q5 {
	static void secondMaxNum(int[] number) {
		int max = number[0];
		int sectmax = 0;
		for (int i = 0; i < number.length; i++) {
			if (max < number[i]) {
				sectmax = max;
				max = number[i];
			} else if (sectmax < number[i] && max > number[i]) {
				sectmax = number[i];

			}

		}
		System.out.println(sectmax);
	}

	public static void main(String[] args) {

		int[] number = { 100, 30, 20, 40 };
		secondMaxNum(number);
	}
}