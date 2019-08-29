// You are given a string S. Count the number of occurrences of all the digits in the string S. 

package Neeraj;

class Assignment9 {
	int count = 0;

	void display(String number) {
		for (int i = 0; i < number.length(); i++) {

			for (int j = 0; j < number.length(); j++) {

				if (number.charAt(i) == number.charAt(j)) {
					count++;

				}

			}

			System.out.println("Number of Occurance of " + number.charAt(i) + ' ' + "in the string" + ' ' + number + ' '
					+ "is " + " " + count);
			count = 0;

		}

	}

	public static void main(String[] args) {
		Assignment9 assignment9 = new Assignment9();
		assignment9.display("128869");

	}
}
