package BhudeviS;

public class AverageOfArray {

	public static void main(String[] args) {

		int arr[] = { 14, 32, 19, 14, 78, 36 };

		float avg = 0;
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {

			sum = sum + arr[i];
			avg=sum/arr.length;
		}
	//	System.out.println(sum);
		System.out.println(avg);

	}

}
