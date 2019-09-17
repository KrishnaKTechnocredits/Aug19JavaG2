package SiddhiB;

public class Asgn2ArrayP7FindPairsWhoseSumEqualToGivenNumber 

{	
	static void findPairOfArrayvalueEqualToGivenSum(int ary [], int sum)
	{
		for (int i = 0; i<ary.length;i++)
		{
			for (int j = 0;j<ary.length;j++)
			{
			 if ((ary[i]+ary[j]) == sum)
			 {	
				System.out.println ("given sum is for :"+ i + " and " + j);
			 }
			}
		}
	}
	public static void main(String[] args) 
	{
		int [] array1 = {2,4,3,5,7,8,9};
		int givenSum = 7;
		findPairOfArrayvalueEqualToGivenSum(array1,givenSum);
	}
}
