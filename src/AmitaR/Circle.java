package AmitaR;

import java.util.Scanner;

public class Circle 
{

	private float radius, area, circumference;

	public void radius()
	{

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius:");
		radius = sc.nextFloat();
	}

	public void getArea() 
	{
		area = (float) 3.14 * radius * radius;

		System.out.println("Area of circle is :" + area);
	}

	public void getCircumference()
	{
		circumference = 2 * (float) 3.14 * radius;
		System.out.println("Circumference of circle is :" + circumference);
	}
}
