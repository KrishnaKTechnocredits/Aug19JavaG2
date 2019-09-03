/*2) Find duplicate number on Integer array in Java? 
 
Hint: There is exactly one number is repeated in the array. You need to write a program to find that duplicate number.
For example, if an array with length 6 contains numbers {0, 3, 1, 2, 3}, then duplicated number is 3.*/

package AmitaR;

public class Assignment2Q2 {

	static void print() {
		int a[] = { 1, 2, 3, 3, 4, 5, 6 };
		for (int i = 0; i <= a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println("duplicate value is  " + a[j]);
				}
			}
		}
	}

	public static void main(String[] args) {
		print();
	}
}
