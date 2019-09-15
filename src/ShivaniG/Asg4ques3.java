package ShivaniG;

import java.util.Scanner;

//WAP to print Fibonacci series up to user required.
public class Asg4ques3 {
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
