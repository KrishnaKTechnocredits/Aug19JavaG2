package assignment_5;

import java.util.Scanner;

//Area of circle, rectangle and triangle using switch case

public class AreaSwitchCase {
	static void area(int choice) {
		Scanner s = new Scanner(System.in);
		switch (choice) {
		case 1:
			System.out.println("Enter radius:");
			float r = s.nextFloat();
			float ac = 3.14f * r * r;
			System.out.println("Area:" + ac);
			break;
		case 2:
			System.out.println("Enter height and base:");
			float h = s.nextFloat();
			float bs = s.nextFloat();
			float art = 0.5f * h * bs;
			System.out.println("Area:" + art);
			break;
		case 3:
			System.out.println("Enter length and breadth:");
			int l = s.nextInt();
			int b = s.nextInt();
			int ar = l * b;
			System.out.println("Area:" + ar);
			break;
		default:
			System.out.println("Wrong Choice!!");
		}
		s.close();
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("MENU:");
		System.out.println("1.Area of a Circle");
		System.out.println("2.Area of a Right Angled Triangle");
		System.out.println("3.Area of a Rectangle");
		System.out.println("4.Exit");
		System.out.println("Enter your option:");
		int choice = s.nextInt();
		area(choice);
		s.close();
	}

}
