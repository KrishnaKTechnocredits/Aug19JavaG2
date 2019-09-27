/*3. Create Employee class and parameterized constructor with attributes empId , empName and
salary. Write a method to display the details of employees. Create a TestEmployee class to test
Employee class functionality.*/

package AmitaR;

public class Employee
{
	int employeeId;
	String EmployeeName;
	double EmployeeSalary;

	public Employee(int i, String n, double s)
	{
		this.employeeId = i;
		this.EmployeeName = n;
		this.EmployeeSalary = s;
	}

	void display() 
	{
		System.out.print("Employee ID is : " + employeeId + "  " + "Employee name is : " + EmployeeName + "  "
				+ "Employee salary is : " + EmployeeSalary);
	}

}
