//3. Write a Java program that takes a year from user and print whether that year is a leap year or no

package AmitaR;

import java.util.Scanner;

public class Q3LeapYear
{
	void leapYear(int yr)
	{
		if ((yr % 400 == 0) || (yr % 4 == 0 && yr % 100 == 0))
		{
			System.out.println("The Year " + yr + " is leap year");
		} else {
			System.out.println(" The year " + yr + " is not a leap year");
		}

	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year");
		int year = sc.nextInt();

		Q3LeapYear lp = new Q3LeapYear();
		lp.leapYear(year);

	}

}
