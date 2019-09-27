package siddhiCoreJava;

import java.util.Scanner;

public class StudentMarks {

	public static void main(String[] args) 
	
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the marks");
		int marks = sc.nextInt();

		if (marks <50)
			System.out.println("failed");
		else if (marks>= 50 && marks <75)
		System.out.println("1st class");
		else if
			(marks >=75 && marks <100)
			System.out.println("distinction");
		
	}

}
