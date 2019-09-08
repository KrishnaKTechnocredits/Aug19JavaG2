package ShivaniG;

import java.util.Scanner;

//WAP to print below-
//*
//* *
//* * *
//* * * *
public class P1 {
	static void pattern(int num){
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number for pattern : ");
		int num = sc.nextInt();
		pattern(num);
		sc.close();
	}
}
