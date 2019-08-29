package SiddhiB;

public class Asgn2ArrayFindMissingNumber
{	
	
	int missingNumber (int receivedAry[])
	{
		int arysum = 0;
		int length = receivedAry.length+1;
	for (int i=0;i<receivedAry.length;i++)
		{
				arysum = arysum +receivedAry[i];
		}	
		   int total = length *(length +1)/2 ;
		   System.out.println("total is " + total);
		   int  missingNum = total-arysum;
		   System.out.println("Missing number in the array is :" + missingNum);
		
	 return missingNum;
	}
	public static void main(String[] args) 
	
	{	
		int ary [] = {1,2,3,5,6};
		Asgn2ArrayFindMissingNumber fmn = new Asgn2ArrayFindMissingNumber();
		fmn.missingNumber(ary);
		

	}

}
