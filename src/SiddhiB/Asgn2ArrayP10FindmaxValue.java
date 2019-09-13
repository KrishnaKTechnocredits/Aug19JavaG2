package SiddhiB;

public class Asgn2ArrayP10FindmaxValue 

{	
	static void maxValueDifferentIndex (int a[], int b[])
	{
		//boolean flag = true;
		for (int i =0;i<a.length;i++)
		{
			if (a[i]>b[i])
			{	//flag = false;
				System.out.println("Max value of between two arrays is a :" + "at index " + i  +":"+ a[i]);
			}	
			else
			{
				System.out.println("Max value of between two arrays is b:" +  "at index " + i +":" + b[i]);
			}
		}
		
	}

	public static void main(String[] args) 
	
	{
		int array1 [] = {11,2,9,14,3};
		int array2 [] = {10,2,18,14,3};
		maxValueDifferentIndex (array1, array2);
		
	}

}
