package ShivaniG;

import java.util.Scanner;

//WAP to print factorial number
public class Asg4ques6 {
	static void factorial(int num) {
		int f = 1;
		for (int i = 1; i <= num; i++) {
			f = f * i;
		}
		System.out.println("Factorial of number is :" + f);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();
		System.out.println("Entered number is : " + num);
		factorial(num);
		sc.close();
	}
}
