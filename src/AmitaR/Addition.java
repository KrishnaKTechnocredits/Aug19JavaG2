/*6. Create a class Addition and write add method for:
a) add two integers
b) add two decimal
c) add two String*/
package AmitaR;

public class Addition 
{

	public int add(int x, int y)
	{
		return (x + y);
	}

	public String add(String st, String rs)
	{
		return (st + rs);
	}

	public double add(double x, double y)
	{
		return (x + y);
	}

	public static void main(String args[])
	{
		Addition a = new Addition();
		System.out.println(a.add(10, 20));
		System.out.println(a.add("amita", "anup"));
		System.out.println(a.add(10.5, 20.5));
	}
}
