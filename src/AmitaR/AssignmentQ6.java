/*6)Write a java program to check the equality of two arrays? 
 
Hint: Input Arrays : 
	First Array : [21, 57, 11, 37, 24]
	Second Array : [21, 57, 11, 37, 24] Two Arrays Are Equal */

package AmitaR;

public class AssignmentQ6 {

	static void print() {
		int count = 0;
		int array[] = { 12, 8, 65, 34 };
		int array1[] = { 8, 65, 34, 12 };

		for (int i = 0; i < array.length; i++) {
			// boolean flag=true;

			for (int j = 0; j < array1.length; j++) {
				if (array[i] == array1[j]) {
					// flag=false;
					count++;
				}
			}

		}
		if (count == array.length) {
			System.out.println("two arrays are equal");
		} else {
			System.out.println("two arrays are not equal");
		}
	}

	public static void main(String[] args) {
		print();

	}
}


