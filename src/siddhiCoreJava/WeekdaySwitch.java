package siddhiCoreJava;

import java.util.Scanner;

public class WeekdaySwitch {

	public static void main(String[] args) 
	
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int day = sc.nextInt();
		
		switch(day)
		{
		case 1:
			System.out.println("Day 1 is Monday");
		break;
		case 2:
			System.out.println("Day 2 is Tuesday");
		break;
		case 3:
			System.out.println("Day 3 is Wednesday");
		break;
		case 4:
			System.out.println("Day 4 is Thrusday");
		break;
		case 5:
			System.out.println("Day 5 is friday");
		break;
		case 6:
			System.out.println("Day 6 is saturday");
		break;
		default :
			System.out.println("Sunday");
		
		}

	}

}
