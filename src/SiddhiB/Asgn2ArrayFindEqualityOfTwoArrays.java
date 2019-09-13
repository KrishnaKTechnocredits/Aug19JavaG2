package SiddhiB;

public class Asgn2ArrayFindEqualityOfTwoArrays 

{
	static void findEquality(int ary1[],int ary2[])
	{
		boolean flag = true;
		for (int i =0;i<ary1.length;i++)
		{
			if (ary1[i]!=ary2[i])
			{
				flag = false;
				break;
			}
			//if (flag == false)
			//{
			 //System.out.println("arrays are  equal");
			//} //else System.out.println("arrays are equal");
		} System.out.println("arrays are not equal");
		 
		
	}
	public static void main(String[] args) 
	
	{
		int array1 [] = {10,16,23,15,31};
		int array2 [] = {10,12,23,15,31};
		findEquality (array1,array2);

	}

}
