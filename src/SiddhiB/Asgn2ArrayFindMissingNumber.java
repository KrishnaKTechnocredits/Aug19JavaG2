package SiddhiB;

public class Asgn2ArrayFindMissingNumber

{	
	int ary [] = {1,2,3,4,5,6,7,8,9,10};
	void missingNumber ()
	{
		for (int i=0;i<ary.length;i++)
		{
				System.out.println("Missing number is : "+ i);
		
		}
		
	}

	public static void main(String[] args) 
	
	{
		Asgn2ArrayFindMissingNumber fmn = new Asgn2ArrayFindMissingNumber();
		fmn.missingNumber();

	}

}
