package assignment_5;

import java.util.Scanner;

//WAP to input student marks by condition

public class MarksOfStudents {
	static void marks(int average) {
		char grade;
		if (average > 75 && average <= 100) {
			grade = 'A';
			System.out.println("Distinction! You get grade " + grade);
		} else if (average > 50 && average <= 75) {
			grade = 'B';
			System.out.println("1st Class! You get grade " + grade);
		} else if (average >= 0 && average <= 50) {
			grade = 'C';
			System.out.println("Failed! You get grade " + grade);
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter average of your marks (less than 100)::");
		int average = sc.nextInt();
		marks(average);
		sc.close();
	}

}
