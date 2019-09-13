package Neeraj;

import java.util.Scanner;

public class Assignment3Q9 {
	float avrage = 0;
	int sum = 0;

	float average(int[] number) {
		for (int i = 0; i < number.length; i++) {
			sum += number[i];
			avrage = (float) sum / number.length;
		}
		return avrage;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number in order to get Avarage");
		int[] number = new int[6];
		
		for (int i = 0; i < number.length; i++) {
			number[i] = sc.nextInt();
		}
		sc.close();
		System.out.println(new Assignment3Q9().average(number));

	}
}
