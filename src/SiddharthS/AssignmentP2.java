package SiddharthS;

public class AssignmentP2
{
	int sumOfArray;
	
	public static void main(String args[])
	{
		new AssignmentP2().print_array_lements();
	}
	
	void print_array_lements()
	{
	    int[] num = {20,40,76,256};
		
		for(int a=0; a<num.length; a++)
		{
			sumOfArray = sumOfArray + num[a];
		}
	System.out.println("sum of array elements is : " + sumOfArray);	
	}
}