package SiddhiB.Assignment3;

public class Asgn3P15FindStringGreaterThan7 
{	
	static void findStringGreaterThan7 (String input[])
	{
		for (int i = 0; i<input.length;i++)
		{
			if (input[i].length() >7)
			{
				System.out.println("String greater than 7 characters is " + input[i]);
			}
		}
		
	}
	public static void main(String[] args) 
	
	{
		String [] inputArray = {"Krishna","Maulik","aakash","harsh", "aakansha", "abhishek"};
		findStringGreaterThan7 (inputArray);

	}

}
