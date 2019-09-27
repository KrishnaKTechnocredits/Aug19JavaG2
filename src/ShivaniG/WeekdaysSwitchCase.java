package assignment_5;

import java.util.Scanner;

//Display the name of the weekday using switch case

public class WeekdaysSwitchCase {
	static void weekday(int day) {
		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Invalid");
			break;
		}
	}

	public static void main(String[] args) {
		int day;
		Scanner SC = new Scanner(System.in);
		System.out.print("Enter a weekday number (1 to 7): ");
		day = SC.nextInt();
		if (day < 1 || day > 7) {
			System.out.println("Invalid weekday number.");
			System.exit(0);
		}
		weekday(day);
		SC.close();
	}

}
