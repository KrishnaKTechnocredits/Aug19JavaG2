package BhudeviS;

public class SumofArray {

	public static void main(String[] args) {

		int[] arr1 = { 1, 5, 9, 3, 7 };
		int[] arr2 = { 1, 7, 9, 3 };

		int sum1 = 0;
		int sum2=0;
		
		for (int i = 0; i < arr1.length; i++) {
			sum1 = sum1 + arr1[i];
		}
	//	System.out.println(sum1);

		
		for (int i = 0; i < arr2.length; i++) {
			sum2 = sum2 + arr2[i];
		}
	//	System.out.println(sum2);
		
System.out.println(sum1+sum2);
	}
	
}
