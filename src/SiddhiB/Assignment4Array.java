package SiddhiB;

class Assignment4Array
{
	
	public static int total (int a[])
	{	int sum = 0;
		for (int i=0;i<a.length;i++)
		{
			if (a[i] >=1 && a[i]<=100)
			
			{
				sum = sum + a[i];
			}
			 else 
			    System.out.println("Outside range");
			  
		 } return sum;

	}
	public static void main (String args [])
	{
		int [] x = {23,12,123,21};
		System.out.println(total(x));
	}
}
