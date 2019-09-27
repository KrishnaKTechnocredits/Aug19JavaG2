/*4. Create a Square class with field side, one parameterized constructor which accept side value .
Write a method to find the area of a square. Write a TestSquareClass to verify Square class
functionality.*/

package AmitaR;

import java.util.Scanner;

public class TestSquareClass
{

	public static void main(String[] args)
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the side value of the square");
		double side=sc.nextDouble();
		
		SquareClass se=new SquareClass(side);
		System.out.println("Area of the sqaure is :"+se.display());
	}

}
