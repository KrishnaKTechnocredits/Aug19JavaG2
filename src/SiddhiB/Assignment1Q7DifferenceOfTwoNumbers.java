package SiddhiB;

public class Assignment1Q7DifferenceOfTwoNumbers 

{
	
	int diff;
	void display(int x, int y)
	{
		diff = x-y;
		if (diff<0)
		{
			diff = diff * -1;
		}
		System.out.println("Diff of " + x + " and " + y + " is :" + diff );
		
	}
	
	public static void main(String[] args)
	
	{
		Assignment1Q7DifferenceOfTwoNumbers adn = new Assignment1Q7DifferenceOfTwoNumbers();
		adn.display(24,23);

	}

}
