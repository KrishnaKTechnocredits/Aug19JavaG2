package Neeraj;



public class PrimeCheck {
	

	static void isPrime(int start, int end) {
		int sum = 0, count=0, avg=0;
	
		for (int number = start; number <= end; number++) {
			int cnt = 0;
			for (int i = 2; i <= number / 2; i++) 
			{
				if (number % i == 0) 
				{
					cnt = 1;
					// System.out.println(number + " " + "is not Prime Number");
					break;
				}
			}
			if (cnt == 0) 
			{
				count++;
				System.out.println(number + "is prime");
				sum = sum + number;
				avg= sum/count;
				
			}
		}

		System.out.println("Sum of all Number" + sum);
		System.out.println("From" + start + "to" + end +"Total Prime Number are"+ count);
		System.out.println("The Avg is" + avg);
	}

	public static void main(String[] args) {
		//for (int i = 2; i <= 100; i++) 
		{
			isPrime(2, 100);
		}
	}
	
}
