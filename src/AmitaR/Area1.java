package AmitaR;

import java.util.Scanner;

public class Area1 {
	
	static double areaR= 0.0;
	static float areaT =  0.0f;
	static double areaC = 0.0;
	static void area(double x, double y)
	{
		System.out.println("Area of rectangle is : "+(areaR=x*y));
	}
	static void area(float x, float y)
	{
		System.out.println("Area of triangle is : "+(areaT=(float)0.5*x*y));
	}
	static void area(double x)
	{
		System.out.println("Area of circle is : "+(areaC=(double)3.14*x*x));
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter r for rectangle");
		System.out.println("Enter t for triangle");
		System.out.println("Enter c for circle");
		String s=sc.next();
		char ch=s.charAt(0);
		float area=0;
		
		switch(ch)
		{
		case 'r':
			System.out.println("Enter length and breadth :");
			double length=sc.nextDouble();
			double breadth=sc.nextDouble();
			area(length, breadth);
			break;
		case 't':
			System.out.println("Enter base and height :");
			float base=sc.nextFloat();
			float height=sc.nextFloat();
			area(base, height);
			break;
		case 'c':
			System.out.println("Enter radius :");
			float radius=sc.nextFloat();
			area(radius);
			break;
		default:
			System.out.println("wrong entry");
		}

		
	}

	}


