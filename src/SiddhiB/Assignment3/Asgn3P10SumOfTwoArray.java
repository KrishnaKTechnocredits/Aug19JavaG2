package SiddhiB.Assignment3;

public class Asgn3P10SumOfTwoArray 
{	
	static void findSumOftwoArray (int ary1[], int ary2 [])
	{
		int sumAry1 = 0;
		int sumAry2 = 0;
		int sumTotal = 0;
		for (int i = 0;i<ary1.length; i ++)
			{
			sumAry1 = sumAry1+ary1[i];
			}
		for (int j = 0;j<ary2.length;j++)
		{
			sumAry2 = sumAry2+ ary2[j];
		}
	 sumTotal = sumAry1+sumAry2;
	 System.out.println("Total sum of two arrays is :" + sumTotal);
	}
	public static void main(String[] args) 
	{
		int firstArray [] = {1,5,9,7,3};
		int secondArray [] = {1,7,9,3};
		findSumOftwoArray(firstArray,secondArray);
	}
}
