//Largest and smallest number in unsorted array? 
package Neeraj;

class Assignment2Q4 {
	int[] number = new int[4];
	int largest = number[0];
	int smallest = number[0];

	void largestSmallest(int[] number) {
		for (int i = 0; i < number.length; i++) {
			if (number[i] > largest) {
				largest = number[i];

			}
			if (number[i] < smallest) {
				smallest = number[i];
			}
		}

		System.out.println("Largest Number in the Array is:" + largest);
		System.out.println("Smallest Number in the Array is:" + smallest);

	}

	public static void main(String[] args) {
		int[] number = { 5, 6, 3, 9, 11 };

		new Assignment2Q4().largestSmallest(number);
	}
}