package ShivaniG;

//WAP to check if a number is Armstrong or not
import java.util.Scanner;

public class Asg4ques5 {
	static void armstrong(int num) {
		int temp=num;
		int a = 0;
		int c = 0;
		while (num > 0) {
			a = num % 10;
			num = num / 10;
			c = c + (a * a * a);
		}

		if (temp == c) {
			System.out.println("It is a armstrong number");
		} else {
			System.out.println("It is not a armstrong number");
		}

		System.out.println("Output number is : " + c);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();
		System.out.println("Entered number is : " + num);
		armstrong(num);
		sc.close();
	}
}
