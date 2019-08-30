public class Assignment2P5
{
	int[] num = {2,6,3,9,11,1,20};
	int largestNumber = num[0];
	int secondLargestNumber = num[0];
	
	public static void main(String[] args)
	{
		new Assignment2P4().findLargestAndShortestNumInArray();
	}
	void findLargestAndShortestNumInArray()
	{
		for(int i=0;i<num.length;i++)
		{
			if(num[i]>largestNumber)
			{
				largestNumber = num[i];
			}
		}
		System.out.println("Largest number in the array set is "+ largestNumber);
		for(int i=0;i<num.length;i++)
		{
			if(num[i]>secondLargestNumber && num[i]!=largestNumber )
			{
				secondLargestNumber = num[i];
			}
		}
		System.out.println("second Largest number in the array set is "+ secondLargestNumber);
	}
	 
}