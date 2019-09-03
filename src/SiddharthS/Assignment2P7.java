public class Assignment2P7
{
	int[] numArray={1,2,4,3,5,6,7,8,9};
	int sum = 7;
	
	public static void main(String args[])
	{
		new Assignment2P7().sumOfIntPairArray();
	}
	
	void sumOfIntPairArray()
	{
		for(int i=0;i<numArray.length;i++)
		{
			for(int j=i+1;j<numArray.length;j++)
			{
				int add = numArray[i]+numArray[j];
				if(add==sum)
				{
					System.out.println("(" + numArray[i] +","+ numArray[j] + ")");
				}
			}
		}
	}
}