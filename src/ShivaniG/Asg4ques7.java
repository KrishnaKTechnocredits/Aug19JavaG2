package ShivaniG;

import java.util.Scanner;

//WAP to print sum of digit(Consider Input as Integer not as String)
public class Asg4ques7 {
	static void sum(int num) {
		int a = 0;
		int c = 0;
		while (num > 0) {
			a = num % 10;
			num = num / 10;
			c = c + a;
		}
		System.out.println("Output number is : " + c);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();
		System.out.println("Entered number is : " + num);
		sum(num);
		sc.close();}
	
}
