package assignment_5;

import java.util.Scanner;

//WAP that takes a year from user and print if it is a leap year or not

public class LeapYear {
 static void leap(int year){
	 if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
         System.out.println("Specified year is a leap year");
      else
         System.out.println("Specified year is not a leap year");
 }
	public static void main(String[] args) {
		int year;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the first number:");
		year = s.nextInt();
		leap(year);
		s.close();
	}

}
