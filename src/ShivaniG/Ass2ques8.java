package ShivaniG;

//Find first differ index from given arrays
public class Ass2ques8 {
	void differ(int First_Array[], int Second_Array[]) {
		int flag = 0;
		int differ = 0;
		for (int i = 0; i < First_Array.length; i++) {
			if (First_Array[i] != Second_Array[i]) {
				flag = 1;
				differ = i;
				break;
			}
		}
		if (flag == 1)
			System.out.println("Two arrays are not equal at index : " + differ  );
		else
			System.out.println("Two arrays are equal");
	}

	public static void main(String[] args) {
		Ass2ques8 check = new Ass2ques8();
		int First_Array[] = { 10,2,9,14,3 };
		int Second_Array[] = { 10,2,18,14,3 };
		check.differ(First_Array, Second_Array);
	}
}
