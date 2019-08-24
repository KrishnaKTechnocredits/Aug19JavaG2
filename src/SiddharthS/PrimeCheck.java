package SiddharthS;

public class PrimeCheck {

	static void isPrime(int startLimit, int endLimit) {
		int count =0;
		int sum = 0;

		for (int start = startLimit; start <= endLimit; start++) {
			for (int i = 2; i <= start / 2; i++) {
				int cnt = 0;
				if (start % i == 0) {
					cnt = 1;
					System.out.println(start + " Number is not prime");
					break;
				}

				if (cnt == 0) {
					count++;
					System.out.println(start + " Number is prime");
					sum = sum + count;
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		// for (int i =1;i<=100;i++)
		// {
		// isPrime(i);
		// }
		// isPrime(21);
		isPrime(100, 150);
	}

}

// break statment doesnt break if condition it is used to break loop hence break
// can be used only with loop