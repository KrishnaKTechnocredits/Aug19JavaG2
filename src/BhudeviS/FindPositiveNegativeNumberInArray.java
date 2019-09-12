package BhudeviS;

public class FindPositiveNegativeNumberInArray {

	void FindPositiveNegativeNumberInArray() {
		int[] arr = { 10, -9, -3, -4, 14, 19, -23, 0 };
		int count = 0;
		int negcount = 0;
		int sum = 0;
		int sum2 = 0;
		for (int i = 0; i < arr.length; i++) 
		{
			if (arr[i] > 0) 
			{
				count++;
				sum = sum + arr[i];
			}
			else if (arr[i] < 0)
			{
				sum2 = sum2 + arr[i];
				negcount++;
			}
		}
		System.out.println("Sum of Positive numbers:"+sum);
		System.out.println("Sum of Negative numbers:"+sum2);

		if (count > 0)
		{
			System.out.println("Positive Numbers are:" + count);
		}
		System.out.println("Negative numbers are:" + (arr.length - negcount));
	}

	public static void main(String[] args) {
		FindPositiveNegativeNumberInArray a = new FindPositiveNegativeNumberInArray();
		a.FindPositiveNegativeNumberInArray();
	}
}
