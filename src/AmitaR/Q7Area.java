/*7. Write a program to calculate area of Rectangle, area of Triangle and area of Circle using switch statement.
Make it a menu driven program..
*/
package AmitaR;

import java.util.Scanner;

public class Q7Area
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter r for rectangle");
		System.out.println("Enter t for triangle");
		System.out.println("Enter c for circle");
		String s = sc.next();
		char ch = s.charAt(0);
		float area = 0;

		switch (ch)
		{
		case 'r':
			System.out.println("Enter length and breadth :");
			float length = sc.nextFloat();
			float breadth = sc.nextFloat();
			System.out.println("Area of rectangle is : " + (area = length * breadth));
			break;
		case 't':
			System.out.println("Enter base and height :");
			float base = sc.nextFloat();
			float height = sc.nextFloat();
			System.out.println("Area of triangle is : " + (area = (float) 0.5 * base * height));
			break;
		case 'c':
			System.out.println("Enter radius :");
			float radius = sc.nextFloat();
			System.out.println("Area of rectangle is : " + (area = (float) 3.14 * radius * radius));
			break;
		default:
			System.out.println("wrong entry");
		}

	}
}
