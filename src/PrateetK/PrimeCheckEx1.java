package PrateetK;

//Problem statemnt : Sum all the prime numbers
public class PrimeCheckEx1 {
	static void isPrime(int start, int end) {
		int sum=1, count=0, avg=0;
		for (int number = 1; number <= end; number++) {// 10 /2
			int cnt = 0; // 3
			for (int i = 2; i <= number / 2; i++) {// 10 /2 /0
				if (number % i == 0) { //
					cnt = 1;
					// System.out.println(number + " is not prime");
					break;
				}
				/*
				 * else { System.out.println(number +"is prime"); break; }
				 */

			}
			if (cnt == 0)
				count++;
				System.out.println(number + " is prime");
				sum = sum + number;
				avg = sum/count;
		} 
		System.out.println("Sum of all prime number:" + sum);
		System.out.println("Total number of prime number between" + start + "to " + end + " is " + count);
		System.out.println("average of sum of these prime nuber is " + avg);

	}//adding a new comment for test

	public static void main(String[] args) {
			isPrime(1,200);// 1..new comment 

	}

}