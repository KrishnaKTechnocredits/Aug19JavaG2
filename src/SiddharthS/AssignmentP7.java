package SiddharthS;

class AssignmentP7
{
	public static void main(String args[])
	{
		new AssignmentP7().absoluteDifference(20,40);
	}
	void absoluteDifference(int x, int y)
	{
		int z = x - y;
		if (x<y)
		{
			System.out.println("Difference is : "+ z);
			z = z*(-1);
			System.out.println("Absolute difference after converting -ve into +ve : "+z);
		}
		else
		{
			System.out.println("Difference is : "+ z);
		}
	}
	
}

//Doubts

//Can i use return statement inside the if and else conditions