/*4. Create a Square class with field side, one parameterized constructor which accept side value .
Write a method to find the area of a square. Write a TestSquareClass to verify Square class
functionality.*/

package AmitaR;

public class SquareClass
{
	double sideValue = 24;
	double area = 0;

	SquareClass(double side)
	{
		sideValue = side;
	}

	double display()
	{
		area = sideValue * sideValue;
		return area;

	}

}
