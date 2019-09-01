/*7) Find all pairs on integer array whose sum is equal to given number?  
Hint: You have given an integer array and a number, you need to write a program to find 
all elements in the array whose sum is equal to the given number.
Remember, the array may contain both positive and negative numbers, 
so your solution should consider that. Input:2, 4, 3, 5, 7, 8, 9 
Given sum:7 
Integer numbers, whose sum is equal to value:7 
(2, 5)  (4, 3) */ 
 
package AmitaR;

public class Assignment2Q7 {

	static void arraySum(int array[], int number) {

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j <= array.length - 1; j++) {
				if (array[i] + array[j] == number) {
					System.out.println("the numbers are  " + array[i] + "   " + array[j]);

				}
			}
		}
	}

	public static void main(String[] args) {
		int a[] = { 2, 4, 3, 5, 7, 6, 1, 9 };
		int sum = 7;
		arraySum(a, sum);
	}
}
