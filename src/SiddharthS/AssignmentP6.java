package SiddharthS;

class AssignmentP6
{
	int[] numArray1 ={17,56,7};
	int[] numArray2 ={21,33,8};
	int sumOfTwoArraySets;
	
	public static void main(String args[])
	{
		new AssignmentP6().addTwoArraySets();
	}
	void addTwoArraySets()
	{
		for(int i=0;i<numArray1.length;i++)
		{
			sumOfTwoArraySets = numArray1[i] + numArray2 [i];
			System.out.print(" "+sumOfTwoArraySets);
		}
	}
	
}
