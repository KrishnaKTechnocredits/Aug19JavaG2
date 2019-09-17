package ShivaniG;

//Find all differ index from given arrays
public class Ass2ques9 {
	void differ(int First_Array[], int Second_Array[]) {
		int flag = 0;
		int differ = 0;
		for (int i = 0; i < First_Array.length; i++) {
			if (First_Array[i] != Second_Array[i]) {
				flag = 1;
				differ = i;
				System.out.println("Two arrays are not equal at index : " + differ  );
			}
		}
		if (flag == 0)
			System.out.println("Two arrays are equal");
	}

	public static void main(String[] args) {
		Ass2ques9 check = new Ass2ques9();
		int First_Array[] = { 10,2,9,14,3 };
		int Second_Array[] = { 10,2,18,14,13 };
		check.differ(First_Array, Second_Array);
	}
}
