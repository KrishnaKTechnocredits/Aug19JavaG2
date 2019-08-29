package BhudeviS;

public class PrimeCheck {

	static void isPrime(int start, int end) {
		int sum = 0, cnt=0;
		for (int number = start; number <= end; number++) {
			int count = 0;
			for (int i = 2; i <= number / 2; i++) {
				if (number % i == 0) {
					count = 1;
					// System.out.println(number + " is not prime");
					break;
				}

			}
			if (count == 0) {
				cnt++;
				System.out.println(number + " is prime");
				sum = sum + number;
			}
		}
		System.out.println("Sum is:" + sum);
		System.out.println("count of prime numbers is "+ cnt);
		System.out.println("Average is " +(sum/cnt));
	}

	public static void main(String[] args) {
		isPrime(200, 300);
	}
}
