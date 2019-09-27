/*6. WAP to input student marks by condition :
Marks is greater than 0 and less than 50--FAIILED
Marks is greater than 50 and less than 75--1st Class
Marks greater than 75 –and less than 100 Distinction*/

package AmitaR;

import java.util.Scanner;

public class Q6StudentsGrade
{

	void grade(int mark)
	{
		if (mark >= 0 && mark < 50)
		{
			System.out.println("You have failed in the exam");
		} else if (mark >= 50 && mark <= 75) 
		{
			System.out.println("You have scored first class");
		} else if (mark > 75 && mark < 100)
		{
			System.out.println("You have passed in Distinction");
		} else if (mark > 100) {
			System.out.println("Invalid number entered");
		}
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total mark");
		int totalMmark = sc.nextInt();

		Q6StudentsGrade mg = new Q6StudentsGrade();
		mg.grade(totalMmark);

	}

}
