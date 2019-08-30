public class Assignment2P4
{
	int[] num = {2,6,3,9,11,1};
	int smallestNumber = num[0];
	int largestNumber = num[0];
	
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
			else if(num[i]<smallestNumber)
			{
				smallestNumber = num[i];
			}
		}
		System.out.println("Smallest number in the array set is " + smallestNumber);
		System.out.println("Largest number in the array set is " + largestNumber);
		System.out.println("Sum of Smallest and Largest number available in array is " +(smallestNumber+largestNumber));
	}
}