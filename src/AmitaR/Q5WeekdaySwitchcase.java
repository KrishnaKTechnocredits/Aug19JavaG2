/*Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and
displays the name of the weekday. (use switch case)*/

package AmitaR;

import java.util.Scanner;

public class Q5WeekdaySwitchcase
{

	void weekdayname(int day)
	{
		String dayname = "";
		switch (day) {
		case 1:
			dayname = "Monday";
			break;
		case 2:
			dayname = "Tuesday";
			break;
		case 3:
			dayname = "Wednesday";
			break;
		case 4:
			dayname = "Thursday";
			break;
		case 5:
			dayname = "Friday";
			break;
		case 6:
			dayname = "Saturday";
			break;
		case 7:
			dayname = "Sunday";
			break;
		default:
			dayname = "wrong day";

	}
		System.out.println("The day you have entered is : " + dayname);
}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();

		Q5WeekdaySwitchcase ws = new Q5WeekdaySwitchcase();
		ws.weekdayname(num);
	}

}
