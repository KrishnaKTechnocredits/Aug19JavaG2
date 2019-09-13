package ShivaniG;

//WAP to print unique number from the two different array
public class Ass2ques11 {
	static int index = 0;
	static void getUniqueArray(int array1[], int array2[]) { // Method starts
		int[] outArray = new int[array1.length + array2.length];
		for (int i = 0; i < array1.length; i++) {
			boolean flag = false;
			for (int j = 0; j < index; j++) {
				if (array1[i] == outArray[j]) {
					flag = true;
					break;
				}
				
			}
			if (flag == false) {
				outArray[index] = array1[i];
				System.out.print( outArray[index] + " "); 
				index++;
			}
		}
// Second for loop starts
		for (int i = 0; i < array2.length; i++) {
			boolean flag = false;
			for (int j = 0; j < index; j++) {
				if (array2[i] == outArray[j]) {
					flag = true;
					break;
				}
			}

			if (flag == false) {
				outArray[index] = array2[i];
				System.out.print( outArray[index] + " "); 
				index++;
			}
		}
		
	
	}

	// Main starts
	public static void main(String[] args) {
		int array1[] = { 1, 3, 6, 9, 7 };
		int array2[] = { 2, 5, 6, 9, 8 };
		getUniqueArray(array1,array2);
	}
}

