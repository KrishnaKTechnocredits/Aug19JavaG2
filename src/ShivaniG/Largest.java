package assignment_5;

import java.util.Scanner;
//WAP to find the largest of three numbers using Logical AND Operator

public class Largest {

	static void findlargest(int x, int y, int z) {
		if (x>y && x>z)
			System.out.println(x + " is largest");
		else if (y>x && y>z)
			System.out.println(y + " is largest");
		else 
			System.out.println(z + " is largest");
	}

	public static void main(String[] args) {
		int x, y, z;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the first number:");
		x = s.nextInt();
		System.out.print("Enter the second number:");
		y = s.nextInt();
		System.out.print("Enter the third number:");
		z = s.nextInt();
		findlargest(x, y, z);
		s.close();
	}

}
