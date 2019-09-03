package ShivaniG;

//Check if array contains a number in Java
public class Ass2ques3 {
	void checksum(int input[], int num) {
		int flag = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i] == num) {
				flag = 1;
				break;
			}
		}
		if (flag == 0)
			System.out.println(num + " is not in the array");
		else
			System.out.println(num + " is in array");
	}

	public static void main(String[] args) {
		Ass2ques3 check = new Ass2ques3();
		int input[] = {2,5,9,7,4,6};
		int num = 7;
		check.checksum(input, num);
	}

}
