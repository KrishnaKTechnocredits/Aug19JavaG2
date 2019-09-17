package ShivaniG;

import java.util.Scanner;

//WAP to reverse number (Consider Input as Integer not as String).
public class Asg4ques4 {
	static void reverse(int num) {
		int temp = 0;
		int rev = 0;
		while(num>0)
		{
			temp = num%10;
			rev = rev*10+temp;
			num=num/10;
		}
		System.out.println("Reverse number is : " + rev);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();
		System.out.println("Entered number is : " + num);
		reverse(num);
		sc.close();
	}
}
