/*3) Check if array contains a number in Java? 
 
Hint: Your method should accept 2 parameters.
 Input array and number.  i/p :-  arr[] = {2,5,9,7,4,6}  number :- 8 o/p :- number is not in arr.*/

package AmitaR;

public class Assignment2Q3 {

	static void displayNumber(int array[], int number) {
		boolean flag = true;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == number) {
				flag = false;
			}
		}
		if (flag == true) {
			System.out.println("The missing no is  " + number);
		}
	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 4, 5 };
		displayNumber(a, 9);
	}

}
