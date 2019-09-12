package SiddhiB;

public class Asgn2ArrayP9FindDifferIndex 

{
	static void findDifferIndex (int ary1 [], int ary2 [])
	{
		for (int i =0;i<ary1.length;i++)
		{
			if (ary1[i]!=ary2[i])
			{
				System.out.println("different index value is at index :" + i);
			}
			
		}
		
	}
	public static void main(String[] args) 
	
	{	
		int [] array1 = {11,2,9,14,3};
		int [] array2 = {10,2,18,14,3};
		findDifferIndex(array1, array2);

	}

}
