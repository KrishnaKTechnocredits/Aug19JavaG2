/*10) Find max value at differed index 
i/p:-    arr1: {10,2,9,14,3}           
arr2: {10,2,18,14,3}
o/p :-    Values are not matching at index -> 2  
            From (9,18) max value is 18 
  */


package AmitaR;

public class Assignment2Q10 {

	static void print() {
		int arr1[] = { 10, 2, 18, 14, 8 };
		int arr2[] = { 10, 2, 9, 14, 8 };

		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i]) {
				System.out.println(" Values are not matching at index   : " + i);
				if (arr1[i] > arr2[i]) {
					System.out.println("maximum value is  " + arr1[i]);
				}

				else {
					System.out.println("maximum value is  " + arr2[i]);
				}
			}

		}

	}

	public static void main(String[] args) {
		print();

	}

}
