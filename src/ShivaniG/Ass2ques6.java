package ShivaniG;

//Write a java program to check the equality of two arrays
public class Ass2ques6 {
	void equal(int First_Array[], int Second_Array[]) {
		int flag = 0;
		for (int i = 0; i < First_Array.length; i++) {
			if (First_Array[i] != Second_Array[i]) {
				flag = 1;
				break;
			}
		}
		if (flag == 1)
			System.out.println("Two arrays are not equal");
		else
			System.out.println("Two arrays are equal");
	}

	public static void main(String[] args) {
		Ass2ques6 check = new Ass2ques6();
		int First_Array[] = { 21, 57, 11, 37, 24 };
		int Second_Array[] = { 21, 57, 11, 37, 24 };
		check.equal(First_Array, Second_Array);
	}
}
