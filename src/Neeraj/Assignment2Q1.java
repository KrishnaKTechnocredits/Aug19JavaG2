// Find the missing number in integer array of 1 to 10?
package Neeraj;
class Assignment2Q1
{
	static int findMissingNum(int [] number)
	{
		int n= number.length+1;
		int totalSum=n*(n+1)/2;
		int arrSum=0;
		for(int i=0;i<number.length;i++)
		{
			arrSum= arrSum + number[i];

		}
		return (totalSum-arrSum);
		
	}

	public static void main(String[] args) {
		int[] number={1,3,2,4,7,6,5,9,8};
		System.out.println("Missing Number in Array is:" + findMissingNum(number));

	}

}