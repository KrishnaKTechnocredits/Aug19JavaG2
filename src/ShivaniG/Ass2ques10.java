package ShivaniG;

//Find max value at differed index
public class Ass2ques10 {
	void max(int First_Array[], int Second_Array[]) {
		int flag = 0;
		int differ = 0;
		int maximum = 0;
		int x = 0;
		int y = 0;
		for (int i = 0; i < First_Array.length; i++) {
			if (First_Array[i] != Second_Array[i]) {
				flag = 1;
				differ = i;
				x = First_Array[i];
				y = Second_Array[i];
				if (x > y) {
					maximum = x;
				} else {
					maximum = y;
				}
				break;
			}
		}
		if (flag == 1) {
			System.out.println("Two arrays are not equal at index : " + differ);
			System.out.println("From " + x + " and " + y + " max value is " + maximum);
		} else
			System.out.println("Two arrays are equal");

	}

	public static void main(String[] args) {
		Ass2ques10 check = new Ass2ques10();
		int First_Array[] = { 10, 2, 9, 14, 3 };
		int Second_Array[] = { 10, 2, 18, 14, 3 };
		check.max(First_Array, Second_Array);
	}
}
