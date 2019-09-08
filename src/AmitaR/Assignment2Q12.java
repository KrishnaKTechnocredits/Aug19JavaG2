/*12) WAP to print common number from two different array 
a. int array1 = {1, 3, 6, 9, 7} 
b. int array2 = {2, 5, 6, 9, 8} output Array :- {6, 9}*/

package AmitaR;

public class Assignment2Q12 {

	static void display() {
		int a[] = { 1, 3, 6, 9, 7 };
		int b[] = { 2, 5, 6, 9, 8 };

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					System.out.print(a[i] + "  ");
				}

			}

		}

	}

	public static void main(String[] args) {
		display();

	}

}
