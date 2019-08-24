package SiddharthS;

class AssignmentP4
{
	int[] num = {6,9,3,8,7,5,4};
    int squareSum;
		
	public static void main(String args[])
	{
		AssignmentP4 ar1 = new AssignmentP4();
		int ans = ar1.squareSumArrayElements();
		System.out.println("sum of square of each array elements is : " +ans);
	}
	
	int squareSumArrayElements()
	{
		for(int i =0;i<num.length;i++)
		{
			squareSum = squareSum + (num[i]*num[i]);
		}
		return squareSum;		
	}
}