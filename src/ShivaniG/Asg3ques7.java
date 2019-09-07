package ShivaniG;

//WAP to find Fibonacci series for user defined number
import java.util.Scanner;

public class Asg3ques7 {
	static void fibonacci(int num) {
		System.out.println("Fibonacci Series :");
		int f1;
		int f2 = 0;
		int f3 = 1;
		for (int i = 1; i <= num; i++) {
			System.out.println(f3 + " ");
			f1 = f2;
			f2 = f3;
			f3 = f1 + f2;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();
		System.out.println("Entered number is : " + num);
		fibonacci(num);
		sc.close();
	}
}
