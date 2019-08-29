/*1) Find the missing number in integer array of 1 to 10? 
 
Hint: You have given an integer array which contains numbers from 1 to 10 but one number is missing,
you need to write a Java program to find that missing number in an array. 
*/

package AmitaR;

public class Assignment2Q1 {

	static void print() {
		int a[] = { 1, 2, 4, 5, 6, 7, 8, 9,10 };
		int i;

		for (i = 1; i <= 10; i++) {
			int count = 0;

			for (int j = 0; j < a.length; j++) {
				if (a[j] == i) {
					count = 1;
				}
			}
			if (count == 0) {
				System.out.println("the missing no is  " + i);
			}
		}
	}

	public static void main(String[] args) {
		print();

	}

}
