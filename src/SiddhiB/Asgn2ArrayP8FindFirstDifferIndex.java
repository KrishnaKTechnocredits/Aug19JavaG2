package SiddhiB;

public class Asgn2ArrayP8FindFirstDifferIndex 

{	static void findFirstDifferIndex(int ary1 [], int ary2 [])
	{
		for (int i = 0;i<ary1.length; i++)
		{
			if (ary1[i]!=ary2[i])
			{
				System.out.println("First different value at index : " + i + " is : " + ary1[i]);
				break;
			}
		} 
	
	}

	public static void main(String[] args) 
	
	{
		int [] array1 = {10,2,9,17,3};
		int [] array2 = {10,5,18,14,3};
		findFirstDifferIndex(array1, array2);
		
	}

}
