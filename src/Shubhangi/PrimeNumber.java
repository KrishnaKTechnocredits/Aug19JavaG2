package Shubhangi;

public class PrimeNumber {

	static void isPrime(int start, int end) { // 21

		int cnt = 0;
		int sum = 0;
		int total_prime=0;
		int avg = 0;
		/*
		 * example 16/2=8 so every number when divided by 2 gives us boundary. That the
		 * maximum number which can divide 16 is 8. Hence we are dividing number by
		 * 2(number/2). To avoid unnecessary iteration of loop after 8.... which will
		 * reduce time complexity.
		 */

		for (int number = start; number <= end; number++) {

			for (int i = 2; i <= i / 2; i++) {

				/*
				 * for 21% 2, 21%3....
				 */

				if (number % i == 0) {
					cnt = 1;

					System.out.println(number + " not prime");
					// break is only used to terminate for loop.
					// if break is used for breaking if then it will give compilation error.

					break;
				}

			}

			if (cnt == 0) {
				
				total_prime ++;
				System.out.println(number + " is prime");
				sum = sum + number;
				avg = sum/total_prime;

			}

		}

		System.out.println("sum is : " + sum);
		System.out.println("From " + start+" to End "+end+" Total prime number are " + total_prime);
		System.out.println("Average is : " + avg);
	}

	public static void main(String[] args) {
		/*
		 * print prime number from 1 to 100
		 */
		isPrime(2, 10);
	}

}
