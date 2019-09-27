package siddhiCoreJava;

import java.util.Scanner;

public class LeapYear {
	
	static void leapyear(int y)
	{
		if (y%4 ==0 && y%400 ==0)
		{
			System.out.println("year is leap");
		} 
		
		else {System.out.println("year is not leap");}
	}

	public static void main(String[] args) 
	
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the year");
		int year = sc.nextInt();
		leapyear(year);
	}
}
