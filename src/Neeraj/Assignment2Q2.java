// Find duplicate number on Integer array in Java?
package Neeraj;
class Assignment2Q2
{
	static void duplicateNum(int [] number)
	{
		for (int i=0;i<number.length ; i++) 
		{
			for (int j= i+1;j<number.length ; j++ ) 
			{
				if(number[i]==number[j])
				{
					System.out.println("Duplicate Number:" + number[i]);
				}
			}
		}
	}

	public static void main(String[] args) {
		int [] number = {0,5,1,2,5};
		duplicateNum(number);

	}
}