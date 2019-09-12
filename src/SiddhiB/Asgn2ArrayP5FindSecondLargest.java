package SiddhiB;

public class Asgn2ArrayP5FindSecondLargest 

{
	static void findSecondLargestNumber(int ary1 [])
	{	
		int tempMax = ary1[0];
		int secondMax = 0;
		for (int i = 0;i<ary1.length;i++)
		 {
			if (tempMax<ary1[i])
			{
				secondMax = tempMax;
				tempMax = ary1[i];
			}
			else if(secondMax<ary1[i] && tempMax>ary1[i])
			{
				secondMax = ary1[i];
			}
			
		 }System.out.println("second highest number in array is :" + secondMax);
		 
		
	}
	public static void main(String[] args)
	
	{
		int [] array1 = {100,23,31,15,12};
		findSecondLargestNumber(array1);

	}

}
