package overloadingConceptAssignment;

import java.util.Scanner;

public class Area {
	static void area(int side) {
		int as = side * side;
		System.out.println("Area:" + as);
	}

	static void area(float r) {
		float ac = 3.14f * r * r;
		System.out.println("Area:" + ac);
	}

	static void area(int length, int breadth) {
		int ar = length * breadth;
		System.out.println("Area:" + ar);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("MENU:");
		System.out.println("1.Area of a Circle");
		System.out.println("2.Area of a Sqaure");
		System.out.println("3.Area of a Rectangle");
		System.out.println("4.Exit");
		System.out.println("Enter your option:");
		int choice = s.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Enter radius:");
			float r = s.nextFloat();
			area(r);
			break;
		case 2:
			System.out.println("Enter side:");
			int side = s.nextInt();
			area(side);
			break;
		case 3:
			System.out.println("Enter length and breadth:");
			int l = s.nextInt();
			int b = s.nextInt();
			area(l, b);
			break;
		default:
			System.out.println("Wrong Choice!!");
		}
		s.close();

	}

}
