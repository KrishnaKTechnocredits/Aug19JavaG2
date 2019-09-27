/*3. Create Employee class and parameterized constructor with attributes empId , empName and
salary. Write a method to display the details of employees. Create a TestEmployee class to test
Employee class functionality.*/


package AmitaR;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestEmployee 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int eid = 0;
		int count = 0;
		while (count < 1)
		{
			System.out.println("Enter Employee_ID");
			try 
			{
				eid = Integer.parseInt(sc.next());
				count++;
			} catch (InputMismatchException ie) 
			{
				System.out.println("Wrong entry..enter Only integers");
			} catch (NumberFormatException ne)
			{
				System.out.println("Wrong entry..enter Only integers");
			}
		}

		System.out.println("Enter Employee name");
		String ename = sc.next();

		double esal = 0.0;
		int count1 = 0;
		while (count1 < 1) {
			System.out.println("Enter Employee salary");
			try 
			{
				esal = sc.nextDouble();
				count1++;
			} catch (InputMismatchException ie)
			{
				System.out.println("Wrong entry..enter Only integers");
			} catch (NumberFormatException ne)
			{
				System.out.println("Wrong entry..enter Only integers");
			}
		}

		Employee emp1 = new Employee(eid, ename, esal);
		emp1.display();

	}

}
