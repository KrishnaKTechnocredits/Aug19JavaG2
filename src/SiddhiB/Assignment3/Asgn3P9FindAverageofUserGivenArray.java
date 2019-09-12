package SiddhiB.Assignment3;

public class Asgn3P9FindAverageofUserGivenArray 
{ 	static float average = 0f;
	static float sum = 0;
	static void findAverageOfGivenArray (int ary [])
	{
		for (int i = 0;i<ary.length;i++)
		{
			sum = sum + ary[i];
		}
		
		average = sum/(ary.length) ;
		System.out.println("Average of given array is : "+ average);
	}
	public static void main(String[] args) 
	
	{
		int [] array = {14,32,19,14,78,36};
		findAverageOfGivenArray(array);
	}

}
