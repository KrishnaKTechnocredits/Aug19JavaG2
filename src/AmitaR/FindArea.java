/*Overloading
 * 2. Create a class Area to find the area of Square, Rectangle and Circle by creating area()
method . Using overloading concept here.*/

package AmitaR;

import java.util.Scanner;

public class FindArea 
{

	void area(float x)
	{
		System.out.println("the area of the square is : " + x * x + "sq units");
	}

	void area(float x, float y)
	{
		System.out.println("the area of the rectangle is " + x * y + "sq units");
	}

	void area(double x) 
	{
		double z = 3.14 * x * x;
		System.out.println("the area of the circle is " + z + "sq units");
	}

	public static void main(String args[])
	{
		FindArea fa = new FindArea();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side value of the square");
		float side = sc.nextFloat();
		fa.area(side);

		System.out.println("Enter the length and breadth of the rectangle");
		float length = sc.nextFloat();
		float breadth = sc.nextFloat();
		fa.area(length, breadth);

		System.out.println("Enter the radius of the circle");
		double radius = sc.nextDouble();
		fa.area(radius);

	}

}
